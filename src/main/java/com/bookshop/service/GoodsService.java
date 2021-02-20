package com.bookshop.service;

import com.bookshop.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {

    public List<Goods> getGoogsByHot(int num);


    public  List<Goods> getGoodsByLastTime(int num);

    public Goods getGoogsByGoodsID(String goodsid);
}
