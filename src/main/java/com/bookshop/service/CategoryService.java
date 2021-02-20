package com.bookshop.service;

import com.bookshop.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public List<Category> getCategoryForIndex(int num);


}
