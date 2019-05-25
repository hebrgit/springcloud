package com.hebo.springcloudapi.service;

import com.hebo.springcloudapi.dto.ResponseDto;
import com.hebo.springcloudapi.entites.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author HEBO
 */
@Component
public class MyFallbackHandler implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public String addUser(User user) {
                return null;
            }

            @Override
            public ResponseDto findUserByUid(String UID) {

                ResponseDto<User> responseDto = new ResponseDto<>();
                    responseDto.setCode(200);
                    responseDto.setMsg("success");
                    responseDto.setData(new User());
                return responseDto;
            }

            @Override
            public List<User> findUsers() {
                User u1 = new User();
                u1.setUID("emp003");
                u1.setUserName("文翰");
                u1.setAge(26);
                u1.setSex(0);
                u1.setBrithy(new Date());
                u1.setDeptId("yf001");
                u1.setDb("db2");
                List<User> users = new ArrayList<>();
                users.add(u1);
                return users;
            }
        };
    }
}
