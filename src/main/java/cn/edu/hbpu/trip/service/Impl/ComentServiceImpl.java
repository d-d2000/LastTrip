package cn.edu.hbpu.trip.service.Impl;

import cn.edu.hbpu.trip.mapper.ContentinfoMapper;
import cn.edu.hbpu.trip.pojo.Contentinfo;
import cn.edu.hbpu.trip.service.ComentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class ComentServiceImpl implements ComentService {
    @Autowired
    private ContentinfoMapper contentinfoMapper;
    //获取评论信息
    public void insertContent(Contentinfo contentinfo) {
        contentinfo.setOvertime(new Date());
        contentinfoMapper.insert(contentinfo);
    }
}
