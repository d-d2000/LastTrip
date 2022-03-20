package cn.edu.hbpu.trip.controller;

import cn.edu.hbpu.trip.pojo.User;
import cn.edu.hbpu.trip.service.UserService;
import cn.hutool.core.io.file.FileNameUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.setting.dialect.Props;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@RequestMapping("/user")
@Controller
public class UserController {
@Autowired
    private UserService userService;
    //用户登录
    @ResponseBody
    @RequestMapping("/login")
    public User login(@RequestBody User user) {
        System.out.println(user);
        return userService.isLogin(user);
    }
    //用户修改信息
    @ResponseBody
    @RequestMapping("/update")
    public String update(@RequestBody User user)
    {
          userService.updateUser(user);
          return "ok";
    }

    //新用户注册
    @ResponseBody
    @RequestMapping("/regist")
    public String regist(User u) throws IllegalStateException, IOException {
        MultipartFile file = u.getImgFile();
        if(file.isEmpty()) {
            return "failed";
        }
        Props prop = Props.getProp("database.properties");
        String path =prop.getStr("uploadPath");
        String fileName = file.getOriginalFilename();
        String newName= UUID.randomUUID().toString(true)+"."+ FileNameUtil.extName(fileName);
        File filePath = new File(path,newName) ;
        if(!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("鍒涘缓鐩綍" +filePath);
        }
        file.transferTo(filePath);
        u.setHeadpic(newName);
        userService.insertRegister(u);
        return "success";
    }
}
