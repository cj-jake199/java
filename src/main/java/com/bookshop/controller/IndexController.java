package com.bookshop.controller;

import com.bookshop.entity.Category;
import com.bookshop.entity.Goods;
import com.bookshop.service.CategoryService;
import com.bookshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
     private GoodsService goodsService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/index")
    public String IndexPage(Model model, HttpSession session)
    {
        List<Goods> hotGoodses=goodsService.getGoogsByHot(6);
        List<Goods> lastGoods=goodsService.getGoodsByLastTime(8);

        List<Category> categories=categoryService.getCategoryForIndex(6);

        model.addAttribute("hotGoodses",hotGoodses);
        model.addAttribute("goodsesLasted",lastGoods);
        model.addAttribute("categories",categories);
        session.setAttribute("base", session.getServletContext().getContextPath());
        session.setAttribute("site","网上书城");
       return "index";
    }

}
