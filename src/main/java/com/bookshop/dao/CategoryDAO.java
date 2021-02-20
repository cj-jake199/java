package com.bookshop.dao;

import com.bookshop.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //用于标注数据访问组件,即DAO组件。
public interface CategoryDAO {

    /**
     * 得到所有的商品分类
     * @return 返回所有商品分类对应的集合2021-02-20
     */
    public List<Category> getCategory(int num);

}
