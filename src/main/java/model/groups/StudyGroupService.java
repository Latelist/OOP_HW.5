package model.groups;

import model.users.Student;
import model.users.Teacher;
import model.users.User;

import java.util.ArrayList;

public interface StudyGroupService {
    void formGroup(ArrayList<User> allStudents, Teacher teacher);
}
