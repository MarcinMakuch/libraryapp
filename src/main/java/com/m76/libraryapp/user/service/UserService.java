package com.m76.libraryapp.user.service;

import com.m76.libraryapp.user.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List <User> getAllUsers();
    User getUserById(long id);
    User updateUser(User user, long id);
    void deleteUser(long id);
}
