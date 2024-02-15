package model.users;

import model.groups.AllTeachers;
import model.groups.Group;
import model.subjects.Subjects;

public class Teacher extends User implements UserService{
    private String degree;
    private int teacherId;

    public Teacher(String name, int age, Subjects subject, String degree, AllTeachers allTeachers) {
        super(name, age, subject);
        this.degree = degree;
        addToGroup(allTeachers);
    }

    public String getSubjectName() {
        return subject.getRuName();
    }

    public Subjects getSubject() {return subject;}

    public int getTeacherId() {
        return teacherId;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "ID преподавателя: " + teacherId + ".\n" + name + ", "
                + degree + ". Предмет: " + subject.getRuName();
    }

    @Override
    public void addToGroup(Group group) {
        if (group.getUsers().isEmpty()) {
            this.teacherId = 0;
        } else {
            this.teacherId = group.getUsers().size();
        }
        group.addUser(this);
    }
}
