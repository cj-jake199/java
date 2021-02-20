package com.bookshop.service.impl;

import com.bookshop.dao.BookMapper;
import com.bookshop.model.Book;
import com.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookService")
public class BookServiceImpl implements BookService {

   @Autowired
  private BookMapper bookMapper;

  public  List<Book> getAllBooks()
  {
     return bookMapper.getAllBooks();
  }


}
