package com.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/login")
    public String admin_login()
    {
       return "admin/login";
    }

    @RequestMapping("/index")
    public String admin_index()
    {
        return "admin/index";
    }
}
