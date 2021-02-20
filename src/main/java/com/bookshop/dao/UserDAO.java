package com.bookshop.dao;

import com.bookshop.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    /*
    * 根据用户名和密码判断用户是否存在。
    * */
    public User findUser(@Param("name") String name,
                         @Param("password") String password);

    /*
    * */

    public void insertUser(User user);

    /*
    * */
}
