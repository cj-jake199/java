package com.bookshop.entity;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    private String id;
    private String name;
    private int goodsNum;

    private List<Goods> goodsList;


    public Category(){
        super();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
