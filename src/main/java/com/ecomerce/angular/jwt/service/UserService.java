package com.ecomerce.angular.jwt.service;

import com.ecomerce.angular.jwt.dao.UserDao;
import com.ecomerce.angular.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User registerNewUser(User user){
        return userDao.save(user);
    }

    public void initRolesAndUser(){

    }


}
