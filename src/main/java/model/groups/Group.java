package model.groups;

import model.users.User;

import java.util.ArrayList;

/*
S — принцип единственной ответственности. Класс отвечает только за сбор пользователей в группу.
O — принцип открытости/закрытости. Абстрактный класс группы задает неизменный каркас, модифицируются наследники.
L — принцип подстановки Барбары Лисков. Группа работает с наследниками абстрактного класса.
D — принцип инверсии зависимостей. Реализации групп зависят от абстрактных классов пользователей и групп,
 а не от конкретных экземпляров.
 */

public abstract class Group<T extends User> {
    protected ArrayList<T> users;

    public Group() {
        users = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        for (User user : users) {
            strb.append(user + "\n");
        }
        return strb.toString();
    }
    public ArrayList<T> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add((T) user);
    }
}
