package com.bookshop.service;

import com.bookshop.entity.User;
import org.springframework.stereotype.Service;

@Service("UserService")
public interface UserService {



    public User findUser(String name,String password);

}
