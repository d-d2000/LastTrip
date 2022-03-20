package cn.edu.hbpu.trip.service;

import cn.edu.hbpu.trip.pojo.User;

public interface UserService {
    //登录
    User isLogin(User u);
    //注册新用户
    void insertRegister(User newUser);
    //修改信息
    void updateUser(User updateUser);
}
