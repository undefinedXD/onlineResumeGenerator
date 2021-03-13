package com.liucw.resumeGenerator.service;


import com.liucw.resumeGenerator.entity.User;

public interface UserService {
    int insertUser(User user);

    User findUserById(int id);


}
