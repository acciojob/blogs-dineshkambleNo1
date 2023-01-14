package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class  UserService {
    @Autowired
    UserRepository userRepository3;

    @Autowired
    BlogService blogService3;

    public void createUser(User user) throws Exception {

        User local = this.userRepository3.findUserByUsername(user.getUsername());

        if(local != null) {
            System.out.println("User is already exists ");
            throw new Exception("User is already exists !!!");

        }

        else {
            // create new user
        }
    }

    public void deleteUser(int userId){
    }

    public void updateUser(User user){
        userRepository3.save(user);
    }

    public User findUserByUsername(String username){
        return userRepository3.findByUsername(username);
    }
}
