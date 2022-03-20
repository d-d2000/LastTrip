package cn.edu.hbpu.trip.service;

import cn.edu.hbpu.trip.pojo.Goodsinfo;
import cn.edu.hbpu.trip.pojo.Head;
import cn.edu.hbpu.trip.pojo.Swap;

import java.util.List;

public interface IndexService {
    List<Head> getAllHeadInfo();
    Goodsinfo getGoodsInfo(int goodsid);
    List<Goodsinfo> getPartGoodsInfo(int adviceid);
}
