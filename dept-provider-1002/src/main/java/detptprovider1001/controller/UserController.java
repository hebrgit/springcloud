package detptprovider1001.controller;

import com.hebo.springcloudapi.dto.ResponseDto;
import com.hebo.springcloudapi.entites.User;
import detptprovider1001.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
@RequestMapping("/user")
@Api
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscoveryClient client;
    @PostMapping("/addUser/")
    @ApiOperation(value = "添加用户",notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户信息user",required = true,dataType = "User")
    public String addUser(@RequestBody User user){
        Integer returnCode = userService.addUser(user);
        return ""+returnCode;
    }

    @GetMapping("/findUser/{id}")
    @ApiOperation(value = "获取用户",notes = "根据UID查找用户信息")
    @ApiImplicitParam(name = "UID",value = "用户的UID",required = true,dataType = "String")
    public ResponseDto findUserByUid(@PathVariable("id") String id){

        User user = userService.select(id);
        ResponseDto<User> responseDto = new ResponseDto<>();
        responseDto.setCode(200);
        responseDto.setMsg("success");
        responseDto.setData(user);
        return responseDto;
    }

    @GetMapping("/findUsers")
    @ApiOperation(value = "获取用户列表",notes = "获取全部的用户信息")
    public List<User> findUsers(){
       return userService.getList();
    }

    /**
     * 获取服务信息
     */
    @GetMapping("/discovery")
    public DiscoveryClient getClient(){

        List<String> services = client.getServices();
        System.out.println("服务列表："+services);
        List<ServiceInstance> instanceList = client.getInstances("dept-provider-1001");
        for (ServiceInstance instance : instanceList){

            System.out.println("服务名称："+instance.getServiceId());
            System.out.println("服务地址："+instance.getUri());
        }
        return this.client;
    }
}
