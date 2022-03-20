package cn.edu.hbpu.trip.service.Impl;

import cn.edu.hbpu.trip.mapper.UserMapper;
import cn.edu.hbpu.trip.pojo.User;
import cn.edu.hbpu.trip.pojo.UserExample;
import cn.edu.hbpu.trip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;
    //用户是否能登录
    public User isLogin(User u) {
        User user = new User();
        user = userMapper.canLogin(u.getUsertel(),u.getPassword());
        if(user != null) return user;
        return null;
    }
    //注册新用户
    public void insertRegister(User newUser) {
        newUser.setType(1);
        userMapper.insert(newUser);
    }
    //用户修改个人信息
    public void updateUser(User updateUser) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUidEqualTo(userMapper.getUserUid(updateUser.getUsertel()).getUid());
        User user = new User();
        user = updateUser;
        userMapper.updateByExampleSelective(user,userExample);
    }
}
