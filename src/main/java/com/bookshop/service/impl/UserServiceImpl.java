package com.bookshop.service.impl;

import com.bookshop.dao.UserDAO;
import com.bookshop.entity.User;
import com.bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUser(String name, String password)
    {

        return userDAO.findUser(name,password);

    }

}
