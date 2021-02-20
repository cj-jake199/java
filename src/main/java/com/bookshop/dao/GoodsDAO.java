package com.bookshop.dao;

import com.bookshop.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsDAO {

     /**
      * 获取最热门商品
      * **/
     public List<Goods> getGoogsByHot(int num);

     /**
      * 根据goodsID获取商品
      * **/
     public Goods getGoogsByGoodsID(@Param("goodsid") String goodsid);

     /**
      * 获取最新商品
      * **/
     public  List<Goods> getGoodsByLastTime(int num);


     /**
      * 通过分类的id来得到商品
      * @param cateId 某个分类的id
      * @param num 需要得到的商品的条数
      * @return 返回一个带有Goods的集合
      */
     public List<Goods> getGoodsByCateID(@Param("cateID") String cateID,
                                         @Param("num") int num);


}
