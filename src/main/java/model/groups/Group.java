package model.groups;

import model.users.User;

import java.util.ArrayList;

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
