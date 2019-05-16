package com.hebo.detptprovider1001.dao;

import com.hebo.springcloudapi.entites.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    public void insert() {
//
//        User user = new User();
//        Date date = new Date(2018,11,04);
//
//        user.setAge(15);
//        user.setBrithy(date);
//        user.setSex(0);
//        user.setUserName("hebo");
//        userMapper.addUser(user);
    }
}