package model.users;

import model.groups.Group;

/*
I — принцип разделения интерфейсов. UserInterface — общие функции для всех пользователей. Отдельный
интерфейс для студентов.
 */

public interface UserService {
    public void addToGroup(Group group);
    public void generateId(Group group);
}
