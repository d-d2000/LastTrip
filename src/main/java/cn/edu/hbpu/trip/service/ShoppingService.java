package cn.edu.hbpu.trip.service;

import cn.edu.hbpu.trip.pojo.Goodsinfo;
import cn.edu.hbpu.trip.pojo.Shoppinginfo;
import cn.edu.hbpu.trip.pojo.Stateinfo;

import java.util.List;

public interface ShoppingService {
    //添加商品
    void addProduct(Shoppinginfo shoppinginfo);
    //删除商品
    void deleteProduct(Shoppinginfo shoppinginfo);
    //查找购物车中的商品
    List<Shoppinginfo> selectProduct(String tel);
    //查找已付款的商品状态
    List<Stateinfo> selectStateProduct(int stateid, int uid);
    //改变付款商品状态
    void updateStateId(Stateinfo stateinfo);
}
