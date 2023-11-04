package org.example.JWT.Practice1.service;

import org.example.JWT.Practice1.model.User;
import org.example.JWT.Practice1.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;


    public String addUser(User user) {
        userRepo.save(user);

        return "User saved";
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
