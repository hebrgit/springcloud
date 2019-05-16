package com.hebo.detptprovider1001.service.impl;

import com.hebo.detptprovider1001.dao.UserMapper;
import com.hebo.springcloudapi.entites.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    UserMapper userMapper;
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() {
        Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

        User user = new User();
        Date date = new Date(2018,11,04);
        user.setAge(15);
        user.setUID("emp004");
        user.setBrithy(date);
        user.setSex(0);
        user.setUserName("14");
        user.setDeptId("yf103");
        logger.info("请输入用户信息{user}",user);
        userMapper.addUser(user);

    }

    @Test
    public void select() {
        String UID = "emp001";
        User user = userMapper.select(UID);
        System.out.println(user);
        Assert.assertNotNull(user);
    }

    @Test
    public void upDate() {
    }

    @Test
    public void delete() {
    }
}