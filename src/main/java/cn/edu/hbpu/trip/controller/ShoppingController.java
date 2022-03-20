package cn.edu.hbpu.trip.controller;

import cn.edu.hbpu.trip.pojo.Goodsinfo;
import cn.edu.hbpu.trip.pojo.Shoppinginfo;
import cn.edu.hbpu.trip.pojo.Stateinfo;
import cn.edu.hbpu.trip.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/shopping")
@Controller
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;
    //增加订单数量
    @ResponseBody
    @RequestMapping("/add")
    public String add(@RequestBody Shoppinginfo shoppinginfo) {

        shoppingService.addProduct(shoppinginfo);
        return "ok";
    }
    //删除商品数量
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(@RequestBody Shoppinginfo shoppinginfo) {

        shoppingService.deleteProduct(shoppinginfo);
        return "ok";
    }
    //获取购物车信息
    @ResponseBody
    @RequestMapping("/getShopping")
    public List<Shoppinginfo> getShopping(String usertel) {
            return shoppingService.selectProduct(usertel);
    }
    //获取订单状态
    @ResponseBody
    @RequestMapping("/getState")
    public List<Stateinfo> getState(@RequestBody Stateinfo stateinfo) {
        return shoppingService.selectStateProduct(stateinfo.getStateid(),stateinfo.getUid());
    }
    //修改订单状态
    @ResponseBody
    @RequestMapping("/existGoods")
    public void existGoods(@RequestBody Stateinfo stateinfo) {
         shoppingService.updateStateId(stateinfo);
    }
}
