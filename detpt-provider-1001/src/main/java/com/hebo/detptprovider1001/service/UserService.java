package com.hebo.detptprovider1001.service;

import com.hebo.springcloudapi.entites.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author HEBO
 */
public interface UserService {

    /**
     * 插入用户
     * @param user 用户
     * @return
     */
    Integer addUser(User user);

    /**
     * 查询用户
     * @param UID 用户id
     * @return
     */
    User select(String UID);


    /**
     * 更新用户信息
     * @param userName
     * @param age
     * @param sex
     * @return
     */
    Integer upDate(@RequestParam("userName")String userName,
                   @RequestParam("age")Integer age,
                   @RequestParam("sex")Integer sex);

    /**
     * 根据用户名删除用户
     * @param username
     * @return
     */
    Integer delete(String username);

    /**
     * 查找所有用户信息
     * @return
     */
    List<User> getList();

}
