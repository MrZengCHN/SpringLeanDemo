package com.springioc.dao.impl;

import com.springioc.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl:addUser()");
    }
}
