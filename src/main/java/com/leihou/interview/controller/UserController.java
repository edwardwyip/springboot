package com.leihou.interview.controller;

import com.leihou.interview.entity.User;
import com.leihou.interview.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;


@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser(User user) {
        userService.insert(user);
        return "success";
    }


    @RequestWrapper
    public void setUserService(){

    }

    @RequestWrapper
    public void setUser(){

    }

    @RequestWrapper
    public void setUser2(){

    }

    @RequestWrapper
    public void setUser3(){
        Integer i = 1;
    }
}





