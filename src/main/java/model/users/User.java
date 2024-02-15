package model.users;

import model.groups.Group;
import model.subjects.Subjects;

public abstract class User {
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
