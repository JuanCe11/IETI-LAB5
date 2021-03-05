package com.example.demo.services;

import java.util.List;
import com.example.demo.User;

public interface UserServicesInterface {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}