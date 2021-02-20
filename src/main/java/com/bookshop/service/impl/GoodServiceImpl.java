package com.bookshop.service.impl;

import com.bookshop.dao.GoodsDAO;
import com.bookshop.entity.Goods;
import com.bookshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodServiceImpl implements GoodsService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public List<Goods> getGoogsByHot(int num)
    {
        return goodsDAO.getGoogsByHot(num);
    }

    @Override
    public  List<Goods> getGoodsByLastTime(int num)
    {
        return goodsDAO.getGoodsByLastTime(num);
    }

    @Override
    public Goods getGoogsByGoodsID(String goodsid)
    {
        return goodsDAO.getGoogsByGoodsID(goodsid);
    }
}
