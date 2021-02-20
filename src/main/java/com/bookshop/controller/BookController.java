package com.bookshop.controller;

import com.bookshop.model.Book;
import com.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
   private BookService bookService;

    @RequestMapping("/list2")
public String ListBook(HttpServletRequest request)
{
    List<Book> list =bookService.getAllBooks();
    request.setAttribute("books",list);
    String tid=request.getParameter("tid");
    System.out.println(tid);
    //JOptionPane.showMessageDialog(null,tid,"IP地址",JOptionPane.INFORMATION_MESSAGE);
    return "ListBook";

}


 @RequestMapping("/list")
public String ListBook(Map<String,Object> map)
    {
      List<Book> list =bookService.getAllBooks();
        map.put("books",list);

        return "ListBook";
    }

}
