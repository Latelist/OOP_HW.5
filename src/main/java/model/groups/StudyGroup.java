package model.groups;

import model.users.Student;
import model.users.Teacher;
import model.users.User;

import java.util.ArrayList;

/*
S — принцип единственной ответственности. Класс отвечает только за формирование группы из преподавателя и списка
студентов по общему предмету.
 */

public class StudyGroup implements StudyGroupService{

    private Teacher teacher;
    private ArrayList<Student> students;

    public StudyGroup(Teacher teacher, ArrayList<User> allStudents) {
        this.teacher = teacher;
        formGroup(allStudents, teacher);
    }

    @Override
    public void formGroup(ArrayList<User> allStudents, Teacher teacher) {
        students = new ArrayList<>();
        for (User student : allStudents) {
            if (student.getSubject().equals(teacher.getSubject())) {
                students.add((Student) student);
            }
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder("Преподаватель: " + teacher.getName() + ". ID — " +
                teacher.getTeacherId() + "\nПредмет: " +
                teacher.getSubjectName() + "\nСтуденты: \n");
        for (Student student : students) {
            strb.append(student.getName() + ". ID — " + student.getStudentId() + "\n");
        }
        return strb.toString();
    }
}
