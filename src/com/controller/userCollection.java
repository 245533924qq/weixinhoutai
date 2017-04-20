package com.controller;

import com.entity.user;
import com.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by V on 2017/4/20.
 */
@Controller
@RequestMapping("/user")
public class userCollection {
    @Resource
    private userService service;
    @RequestMapping("/save")
    public String handle(user User){
    service.save(User);
    return "";
    }
}
