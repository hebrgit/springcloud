package com.hebo.detptprovider1001.service.impl;

import com.hebo.detptprovider1001.dao.UserMapper;
import com.hebo.detptprovider1001.service.UserService;
import com.hebo.springcloudapi.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User select(String UID) {
        return userMapper.select(UID);
    }

    @Override
    public Integer upDate(String userName, Integer age, Integer sex) {
        return null;
    }

    @Override
    public Integer delete(String username) {
        return null;
    }

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
