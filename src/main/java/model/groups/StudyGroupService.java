package model.groups;

import model.users.Teacher;
import model.users.User;
import java.util.ArrayList;

/*
O — принцип открытости/закрытости. Интерфейс задает неизменный контракт на выполнение действия, конкретная реализация —
в имплементирующих классах.
 */

public interface StudyGroupService {
    void formGroup(ArrayList<User> allStudents, Teacher teacher);
}
