package cn.edu.hbpu.trip.service.Impl;

import cn.edu.hbpu.trip.mapper.ShoppinginfoMapper;
import cn.edu.hbpu.trip.mapper.StateinfoMapper;
import cn.edu.hbpu.trip.mapper.UserMapper;
import cn.edu.hbpu.trip.pojo.*;
import cn.edu.hbpu.trip.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Autowired
    private ShoppinginfoMapper shoppinginfoMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StateinfoMapper stateinfoMapper;
    //将商品添加到数据库
    public void addProduct(Shoppinginfo shoppinginfo) {
        //如果用户的购物表中没有数据则添加
        if(shoppinginfoMapper.isThisGoods(shoppinginfo.getGoodsid(),userMapper.getUserUid(shoppinginfo.getUsertel()).getUid()) == null ) {
            shoppinginfo.setUid(userMapper.getUserUid(shoppinginfo.getUsertel()).getUid());
            shoppinginfo.setPersonnum(1);
            shoppinginfoMapper.insert(shoppinginfo);
        } else {
            //每次增加对应的数量
            int num = shoppinginfoMapper.goodsNum(shoppinginfo.getGoodsid(),userMapper.getUserUid(shoppinginfo.getUsertel()).getUid()) + 1;
            ShoppinginfoExample shoppinginfoExample = new ShoppinginfoExample();
            shoppinginfoExample.createCriteria().andGoodsidEqualTo(shoppinginfo.getGoodsid()).andUidEqualTo(userMapper.getUserUid(shoppinginfo.getUsertel()).getUid());
            Shoppinginfo shoppinginfo1 = new Shoppinginfo();
            shoppinginfo1.setPersonnum(num);
            shoppinginfoMapper.updateByExampleSelective(shoppinginfo1,shoppinginfoExample);
        }

    }
    //将商品从数据库移除
    public void deleteProduct(Shoppinginfo shoppinginfo) {
        int num = shoppinginfoMapper.goodsNum(shoppinginfo.getGoodsid(),userMapper.getUserUid(shoppinginfo.getUsertel()).getUid()) - 1;
        //如果该商品的数量减为0，从数据库中移除
        if(num == 0) {
            ShoppinginfoExample shoppinginfoExample1 = new ShoppinginfoExample();
            shoppinginfoExample1.createCriteria().andGoodsidEqualTo(shoppinginfo.getGoodsid()).andUidEqualTo(userMapper.getUserUid(shoppinginfo.getUsertel()).getUid());
            shoppinginfoMapper.deleteByExample(shoppinginfoExample1);
            return;
        }
        //每次都-1
        ShoppinginfoExample shoppinginfoExample = new ShoppinginfoExample();
        shoppinginfoExample.createCriteria().andGoodsidEqualTo(shoppinginfo.getGoodsid()).andUidEqualTo(userMapper.getUserUid(shoppinginfo.getUsertel()).getUid());
        Shoppinginfo shoppinginfo1 = new Shoppinginfo();
        shoppinginfo1.setPersonnum(num);
        shoppinginfoMapper.updateByExampleSelective(shoppinginfo1,shoppinginfoExample);
    }
    //查询用户购物车中的信息
    public List<Shoppinginfo> selectProduct(String tel) {

        return shoppinginfoMapper.getShoppingInfo(userMapper.getUserUid(tel).getUid());
    }
    //查找不同状态的商品
    public List<Stateinfo> selectStateProduct(int stateid, int uid) {

        return stateinfoMapper.getStateGoods(uid,stateid);
    }
    //改变订单的状态
    public void updateStateId(Stateinfo stateinfo) {
        Stateinfo stateinfo1 = new Stateinfo();
        stateinfo1.setStateid(5);
        StateinfoExample stateinfoExample = new StateinfoExample();
        stateinfoExample.createCriteria().andUidEqualTo(stateinfo.getUid()).andStateidEqualTo(stateinfo.getStateid() + 1).andGoodsidEqualTo(stateinfo.getGoodsid());
        stateinfoMapper.updateByExampleSelective(stateinfo1,stateinfoExample);
    }
}
