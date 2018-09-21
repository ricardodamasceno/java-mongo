package com.mongo.controller;

import com.mongo.model.User;
import com.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public User user(){
        return userService.saveUser(new User("Vinicius", "Damasceno"));
    }

    @ResponseBody
    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public User findByName(){
        return userService.findByName("Ricardo");
    }

    @ResponseBody
    @RequestMapping(value = "/findByLastName", method = RequestMethod.GET)
    public List<User> findByLastName(){
        return userService.findUserByLastName("Damasceno");
    }

}
