package com.hebo.dept.controller;

import com.hebo.springcloudapi.dto.ResponseDto;
import com.hebo.springcloudapi.entites.User;
import com.hebo.springcloudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HEBO
 */
@RestController
@RequestMapping("/fegin")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){

        String code = userService.addUser(user);

        if ("1".equals(code)){
            return "success";
        }else {
            return "fail";
        }
    }

    @GetMapping("/findUser/{id}")
    public ResponseDto findUserByUid(@PathVariable("id") String id){
        ResponseDto responseDto = userService.findUserByUid(id);
        return responseDto;
    }

    @GetMapping("/findUsers")
    public List<User> findUsers(){
        return  userService.findUsers();
    }


}
