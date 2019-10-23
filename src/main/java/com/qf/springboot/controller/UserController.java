package com.qf.springboot.controller;


import com.qf.springboot.config.Resource;
import com.qf.springboot.entity.TUser;
import com.qf.springboot.entity.User;
import com.qf.springboot.serivce.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;



@RestController
@RequestMapping("user")
public class UserController {

    private ITUserService userService;

    @Autowired
    private Resource resource;

   @GetMapping("hello")
    public String hello(){
        return "hello,springboot~~~~";
    }
    @GetMapping("getImageServer")
    public String getImageServer(){
//       return imageServer;
        return resource.getImageServer();
    }
    @GetMapping("getEmailServer")
    public String getEmailServer(){
       return resource.getEmailServer();
    }
    @GetMapping("{id}")
    public TUser getById(@PathVariable("id") int id){
        System.out.println("id="+id);
        System.out.println("查询成功");
        return userService.getById(id);
    }
    @DeleteMapping("{id}")
    public String delById(@PathVariable("id") Long id) {
        System.out.println("id="+id);
        System.out.println("删除成功");
        return"ok";
    }
    @PostMapping("add")
    public String add(User user){
        System.out.println(user.getDate());
        return"ok";
    }
}
