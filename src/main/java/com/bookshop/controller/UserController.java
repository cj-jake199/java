package com.bookshop.controller;

import com.bookshop.entity.User;
import com.bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "adminLogin",method = RequestMethod.POST)
    public String adminLogin(String name, String password, HttpSession session)
    {

        User adminUser=userService.findUser(name,password);
        System.out.println(adminUser);
        if(adminUser==null)
        {
          return "admin/login";
        }

        if(!adminUser.getRole().equals("a"))
        {
            //权限不足，不是管理员
            return "admin/login";
        }

        session.setAttribute("user",adminUser);
        return "/admin/index";

    }
}
