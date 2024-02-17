package model.groups;

import model.users.Teacher;
import java.util.ArrayList;


public class AllTeachers extends Group{
    public AllTeachers(ArrayList<Teacher> teachers) {
        this.users = teachers;
    }
}
