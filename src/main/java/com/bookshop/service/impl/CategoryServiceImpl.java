package com.bookshop.service.impl;

import com.bookshop.dao.CategoryDAO;
import com.bookshop.dao.GoodsDAO;
import com.bookshop.entity.Category;
import com.bookshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public List<Category> getCategoryForIndex(int num)
    {
           List<Category> categoryList=categoryDAO.getCategory(6);

        for (Category category:categoryList) {

            //System.out.println(goodsDAO.getGoodsByCateID(category.getId(),num));
            category.setGoodsList(goodsDAO.getGoodsByCateID(category.getId(),num));
        }
        System.out.println(categoryList);
        return categoryList;
    }



}
