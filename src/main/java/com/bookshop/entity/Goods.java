package com.bookshop.entity;

import java.io.Serializable;

public class Goods implements Serializable {
    private String id;
    private String name;
    private String goodsNo;
    private String categoryId;
    private float price1;
    private float price2;
    private int stock;
    private String thumbnail;
    private String description;
    private int role;
    private int sellTime;
    private int sellNum;
    private float score;


   private Category category;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public float getPrice1() {
        return price1;
    }

    public float getPrice2() {
        return price2;
    }

    public int getStock() {
        return stock;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public int getRole() {
        return role;
    }

    public int getSellTime() {
        return sellTime;
    }

    public int getSellNum() {
        return sellNum;
    }

    public float getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setPrice1(float price1) {
        this.price1 = price1;
    }

    public void setPrice2(float price2) {
        this.price2 = price2;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setSellTime(int sellTime) {
        this.sellTime = sellTime;
    }

    public void setSellNum(int sellNum) {
        this.sellNum = sellNum;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Goods(String id, String name, String goodsNo, String categoryId, float price1, float price2, int stock, String thumbnail, String description, int role, int sellTime, int sellNum, float score) {
        this.id = id;
        this.name = name;
        this.goodsNo = goodsNo;
        this.categoryId = categoryId;
        this.price1 = price1;
        this.price2 = price2;
        this.stock = stock;
        this.thumbnail = thumbnail;
        this.description = description;
        this.role = role;
        this.sellTime = sellTime;
        this.sellNum = sellNum;
        this.score = score;
    }
}
