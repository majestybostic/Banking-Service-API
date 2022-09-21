package com.ey.services;

import com.ey.models.User;
import com.ey.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User getUserById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepo.findAll();
    }
}
