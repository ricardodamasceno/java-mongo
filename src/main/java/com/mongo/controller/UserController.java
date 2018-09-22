package com.mongo.controller;

import com.mongo.model.User;
import com.mongo.service.UserService;
import com.mongo.vo.request.UserRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("rest/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public User user(@RequestBody @Valid UserRequestVO vo){
        return userService.saveUser(new User(vo.getName(), vo.getLastName()));
    }

    @ResponseBody
    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public User findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @ResponseBody
    @RequestMapping(value = "/findByLastName/{lastName}", method = RequestMethod.GET)
    public List<User> findByLastName(@PathVariable String lastName){
        return userService.findUserByLastName(lastName);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<User> findByLastName(){
        return userService.findAll();
    }

}
