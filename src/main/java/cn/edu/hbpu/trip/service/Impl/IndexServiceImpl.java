package cn.edu.hbpu.trip.service.Impl;

import cn.edu.hbpu.trip.mapper.*;
import cn.edu.hbpu.trip.pojo.Goodsinfo;
import cn.edu.hbpu.trip.pojo.Head;
import cn.edu.hbpu.trip.pojo.Picinfo;
import cn.edu.hbpu.trip.pojo.Swap;
import cn.edu.hbpu.trip.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private HeadMapper headMapper;
    @Autowired
    private GoodsinfoMapper goodsinfoMapper;
    @Autowired
    private PicinfoMapper picinfoMapper;
    @Autowired
    private ContentinfoMapper contentinfoMapper;
    //获取头部的信息
    public List<Head> getAllHeadInfo() {
        return headMapper.getHead();
    }
    //获取商品的所有详情信息
    public Goodsinfo getGoodsInfo(int goodsid) {
        Goodsinfo goodsinfo = new Goodsinfo();
        goodsinfo = goodsinfoMapper.getGoodsDetails(goodsid);
        goodsinfo.setPicList(picinfoMapper.getPicInfo(goodsid));
        goodsinfo.setPingLunList(contentinfoMapper.getContent(goodsid));
        return goodsinfo;
    }
    //获取商品的部分信息
    public List<Goodsinfo> getPartGoodsInfo(int adviceid) {
        return goodsinfoMapper.getPartGoodsInfo(adviceid);
    }
}
