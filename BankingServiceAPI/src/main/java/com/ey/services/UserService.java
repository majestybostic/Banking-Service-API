package com.ey.services;

import com.ey.models.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    List<User> getAllUser();




}
