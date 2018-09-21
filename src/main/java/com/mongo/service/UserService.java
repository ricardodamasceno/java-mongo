package com.mongo.service;

import com.mongo.model.User;
import com.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> findUserByLastName(String lastName){
        return userRepository.findByLastName(lastName);
    }

    public User findByName(String name){
        return userRepository.findByName(name);
    }

}


