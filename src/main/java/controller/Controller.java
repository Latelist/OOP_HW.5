package controller;

import model.groups.AllStudents;
import model.groups.AllTeachers;
import model.groups.StudyGroup;
import model.subjects.Subjects;
import model.users.Student;
import model.users.Teacher;

import java.util.ArrayList;

public class Controller {
    public void run() {
        AllStudents allStudents = new AllStudents(new ArrayList<Student>());
        AllTeachers allTeachers = new AllTeachers(new ArrayList<Teacher>());
        Teacher teacher1 = new Teacher(
                "Смирнов Никита Владимирович",
                43,
                Subjects.PROGRAMMING,
                "Магистр",
                allTeachers);

        Student student1 = new Student("Шестикрылый Серафим", 17, Subjects.PROGRAMMING, allStudents);
        Student student2 = new Student("Смышленая Юлия", 17, Subjects.PROGRAMMING, allStudents);
        Student student3 = new Student("Отзывчивый Николай", 17, Subjects.PROGRAMMING, allStudents);

        Teacher teacher2 = new Teacher(
                "Валерьянов Николай Павлович",
                38,
                Subjects.MATH,
                "Кандидат наук",
                allTeachers);

        Student student4 = new Student("Биполярная Ксения", 18, Subjects.MATH, allStudents);
        Student student5 = new Student("Легкомысленная Мария", 17, Subjects.MATH, allStudents);

        Teacher teacher3 = new Teacher(
                "Горьянова Амелия Викторовна",
                33,
                Subjects.ART,
                "Магистр",
                allTeachers);

        Student student6 = new Student("Неразговорчивый Антон", 18, Subjects.ART, allStudents);
        Student student7 = new Student("Кудрявый Михаил", 18, Subjects.ART, allStudents);
        Student student8 = new Student("Бесцельная Ольга", 18, Subjects.ART, allStudents);

        System.out.println(allStudents);
        System.out.println(allTeachers);

        StudyGroup studyGroup1 = new StudyGroup(teacher1, allStudents.getUsers());
        StudyGroup studyGroup2 = new StudyGroup(teacher2, allStudents.getUsers());
        StudyGroup studyGroup3 = new StudyGroup(teacher3, allStudents.getUsers());

        System.out.println(studyGroup1);
        System.out.println(studyGroup2);
        System.out.println(studyGroup3);
    }
}
