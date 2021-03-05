package com.example.demo.services;

import java.util.List;

import com.example.demo.User;

import org.springframework.stereotype.Service;

@Service("UserServices")
public class UserServices implements UserServicesInterface {
    public List<User> getAll() {
        return null;
    };

    public User getById(String userId) {
        return null;
    };

    public User create(User user) {
        return null;
    };

    public User update(User user) {
        return user;
    };

    public void remove(String userId) {

    };

}