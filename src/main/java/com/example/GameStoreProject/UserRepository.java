package com.example.GameStoreProject;

import java.util.ArrayList;

public class UserRepository {

    private static UserRepository userRepository;
    private ArrayList<User> users;

    private UserRepository() {
        this.users = new ArrayList<>();
    }

    public static UserRepository getInstance() {
        if (userRepository == null)
            userRepository = new UserRepository();
        return userRepository;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name))
                return users.get(i);
        }
        return null;
    }
}
