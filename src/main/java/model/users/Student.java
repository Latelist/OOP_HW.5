package model.users;

import model.generators.NotesGenerator;
import model.groups.AllStudents;
import model.groups.Group;
import model.subjects.Subjects;

public class Student extends User implements StudentService {
    private int studentId;
    private double average;
    private NotesGenerator listNotes;

    public Student(String name, int age, Subjects subject, AllStudents allStudents) {
        super(name, age, subject);
        listNotes = new NotesGenerator();
        average = calculateAverage();
        addToGroup(allStudents);
        generateId(allStudents);
    }

    @Override
    public void generateId(Group group) {
        if (group.getUsers().isEmpty()) {
            this.studentId = 0;
        } else {
            this.studentId = group.getUsers().size();
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (Integer note : listNotes.getNotes()) {
            sum += note.doubleValue();
        }
        average = sum/listNotes.getNotes().size();
        return average;
    }

    @Override
    public String toString() {
        return "ID студента: " + studentId + ".\n" + name + ", " + age + " лет. Изучает предмет: " +
                 subject.getRuName() + ". Средний балл: " + average;
    }
    public int getStudentId() {
        return studentId;
    }
    public double getAverage() {
        return average;
    }
    public NotesGenerator getListNotes() {
        return listNotes;
    }

    @Override
    public void addToGroup(Group group) {
        group.addUser(this);
    }
}
