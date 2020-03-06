package com.mightyjava.service;


import com.mightyjava.modal.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}