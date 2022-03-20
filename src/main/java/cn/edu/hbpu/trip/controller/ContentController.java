package cn.edu.hbpu.trip.controller;

import cn.edu.hbpu.trip.pojo.Contentinfo;
import cn.edu.hbpu.trip.service.ComentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/ctx")
@Controller
public class ContentController {
    @Autowired
    private ComentService comentService;
    //获取评论
    @ResponseBody
    @RequestMapping("/insertCtx")
    public String insertCtx(@RequestBody Contentinfo contentinfo) {
        comentService.insertContent(contentinfo);
        return "ok";
    }

}
