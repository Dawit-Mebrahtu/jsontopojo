package com.selfstudy.jsontopojo.entity;

import java.util.List;

public class UsersList {
    private List<User> users;

    public UsersList(){}

    public UsersList(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
