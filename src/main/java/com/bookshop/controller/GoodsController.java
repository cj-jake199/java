package com.bookshop.controller;

import com.bookshop.entity.Goods;
import com.bookshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/view")
    public String GoodsView(HttpServletRequest request)
    {
        Goods goods=null;
        String goodsid=request.getParameter("goodsId");
        if(!goodsid.isEmpty()) {
             goods = goodsService.getGoogsByGoodsID(goodsid);
            request.setAttribute("goods",goods);
        }
        else
        {
            //商品不存在
        }
        request.setAttribute("goods",goods);
        System.out.println(goodsid);


        return "goods_view";
    }

}
