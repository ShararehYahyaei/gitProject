package org.example.service;

import org.example.entity.User;

public class UserServiceImpl implements UserService {

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public String getUserInfo() {
        return "Hi I am the get info method";
    }
}
