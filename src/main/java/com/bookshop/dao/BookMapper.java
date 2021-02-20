package com.bookshop.dao;

import com.bookshop.model.Book;

import java.util.List;

public interface BookMapper {

    /**
     * 获得所有图书
     */
    public List<Book> getAllBooks();

}
