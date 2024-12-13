package com.springioc.controller;

import com.springioc.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Resource
    public UserService userService;
    public void addUser(){
        System.out.println("UserController:addUser()");
        userService.addUser();
    }
}
