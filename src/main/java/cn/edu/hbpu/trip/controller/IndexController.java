package cn.edu.hbpu.trip.controller;

import cn.edu.hbpu.trip.pojo.Goodsinfo;
import cn.edu.hbpu.trip.pojo.Head;
import cn.edu.hbpu.trip.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/index")
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;
    //获取首页头部信息
    @ResponseBody
    @RequestMapping("/getHead")
    public List<Head> getHead() {
        return indexService.getAllHeadInfo();
    }

    //获取首页景点部分信息
    @ResponseBody
    @RequestMapping("/getPartInfo")
    public List<Goodsinfo> getPartInfo(int adviceid) {

        return indexService.getPartGoodsInfo(adviceid);
    }
    //获取详情页面信息
    @ResponseBody
    @RequestMapping("/getDetail")
    public Goodsinfo getDetail(int goodsid) {
        return indexService.getGoodsInfo(goodsid);
    }
}
