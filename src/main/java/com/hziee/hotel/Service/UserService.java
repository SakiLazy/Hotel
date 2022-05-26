package com.hziee.hotel.Service;

import com.hziee.hotel.Bean.Admin;
import com.hziee.hotel.Bean.User;
import com.hziee.hotel.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User LoginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }

    public void Insert(String name, String password, String phone, String email) {
        userMapper.saveInfo(name, password, phone, email);
    }

    public Admin AdminLogin(String name,String password) {
        return userMapper.getAdminInfo(name, password);
    }

    public void ChangeUserInfo(String name, String password, String phone, String email) {
        userMapper.changeUserInfo(name,password,phone,email);
    }
}