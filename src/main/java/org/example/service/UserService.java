package org.example.service;

import org.example.entity.User;

public interface UserService {

    User getById(Long id);
    User findByName(String name);
    String getUserInfo();

}
