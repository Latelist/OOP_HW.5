package model.groups;

import model.users.Student;

import java.util.ArrayList;

public class AllStudents extends Group{

    public AllStudents(ArrayList<Student> students) {
        this.users = students;
    }


}
