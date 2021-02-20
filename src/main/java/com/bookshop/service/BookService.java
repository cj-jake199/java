package com.bookshop.service;


import com.bookshop.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface BookService {



    public List<Book> getAllBooks();

    //boolean hasMatchUser(String username,String password);
    /*
    @Resource
    BookDAO bookdao;



    public List<Book> getAllBooks() {
        return bookdao.getAllBooks();
    }

    public Book getBookById(int id){
        return bookdao.getBookById(id);
    }

    public int add(Book entity) throws Exception {
        if(entity.getTitle()==null||entity.getTitle().equals("")){
            throw new Exception("书名必须不为空");
        }
        return bookdao.add(entity);
    }

    @Transactional
    public int add(Book entity1,Book entityBak){
        int rows=0;
        rows=bookdao.add(entity1);
        rows=bookdao.add(entityBak);
        return rows;
    }

    public int delete(int id) {
        return bookdao.delete(id);
    }



    public int delete(String[] ids){
        int rows=0;
        for (String idStr : ids) {
            int id=Integer.parseInt(idStr);
            rows+=delete(id);
        }
        return rows;
    }

    public int update(Book entity) {
        return bookdao.update(entity);
    }

     */

}
