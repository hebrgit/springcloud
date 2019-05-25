package com.hebo.springcloudapi.service;

import com.hebo.springcloudapi.dto.ResponseDto;
import com.hebo.springcloudapi.entites.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author HEBO
 */
@FeignClient(value = "DEPT-PROVIDER-1000",fallbackFactory = MyFallbackHandler.class)
public interface UserService {

    /**
     * 插入用户
     * @param user 用户
     * @return
     */
    @PostMapping("/user/addUser/")
    String addUser( User user);

    /**
     * 查询用户
     * @param UID 用户id
     * @return
     */
    @GetMapping("user/findUser/{id}")
    ResponseDto findUserByUid(@PathVariable("id") String UID);


    /**
     * 查找所有用户信息
     * @return
     */
    @GetMapping("/user/findUsers")
    List<User> findUsers();
}
