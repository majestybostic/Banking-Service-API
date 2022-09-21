package com.ey.services;

import com.ey.models.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User getUserById(int id);
    List<User> getAllUsers();
    User createUser(User user);




}
