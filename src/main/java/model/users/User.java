package model.users;

import model.groups.Group;
import model.subjects.Subjects;

/*
O — принцип открытости/закрытости. Абстрактный класс пользователя — каркас, расширяется наследниками.
L — принцип подстановки Барбары Лисков. Если подставить наследников в код вместо User, ничего не сломается.
D — принцип инверсии зависимостей. Конкретные реализации классов — студент и преподаватель — зависят от абстрактного
класса и взаимодействуют с другими классами через абстракцию.
 */
public abstract class User implements UserService{
    protected String name;
    protected int age;
    protected Subjects subject;

    public User(String name, int age, Subjects subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Subjects getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void addToGroup(Group group);
}
