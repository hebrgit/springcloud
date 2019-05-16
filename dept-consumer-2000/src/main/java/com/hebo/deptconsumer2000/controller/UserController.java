package com.hebo.deptconsumer2000.controller;

import com.hebo.springcloudapi.dto.ResponseDto;
import com.hebo.springcloudapi.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @author HEBO
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    private static final String URL = "http://dept-provider-1000";
    @Autowired
    RestTemplate restTemplate;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){

        String code = restTemplate.postForObject(URL + "/user/addUser", user, String.class);

        if ("1".equals(code)){
            return "success";
        }else {
            return "fail";
        }
    }

    @GetMapping("/findUser/{id}")
    public ResponseDto findUserByUid(@PathVariable("id") String id){
        ResponseDto responseDto = restTemplate.getForObject(URL+"/user/findUser/"+id, ResponseDto.class);
        return responseDto;
    }

    @GetMapping("/findUsers")
    public List<User> findUsers(){
        return  restTemplate.getForObject(URL+"/user/findUsers",List.class);
    }

    /**
     * 获取服务信息
     */
    @GetMapping("/discovery")
    public DiscoveryClient getClient(){

        return restTemplate.getForObject(URL+"/user/discovery",DiscoveryClient.class);
    }
}
