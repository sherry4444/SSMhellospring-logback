package com.test.controller;

import com.test.domain.UserInfo;
import com.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by wgt on 2017/3/10.
 */
@Controller
@RequestMapping("/userInfo")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(UserInfo userInfo){
        System.out.println(userInfo);
        userService.addUserInfo(userInfo);
        return "success";
    }
}
