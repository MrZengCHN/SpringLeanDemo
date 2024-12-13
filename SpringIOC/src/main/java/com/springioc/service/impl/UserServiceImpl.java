package com.springioc.service.impl;

import com.springioc.dao.UserDao;
import com.springioc.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void addUser() {
        System.out.println("UserServiceImpl:AddUser()");
        userDao.addUser();
    }
}
