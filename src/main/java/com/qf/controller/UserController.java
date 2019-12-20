package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/add")
    public Integer add(@RequestBody User user){
        log.debug("user="+user);
        log.debug("user="+user);
        return userService.addUser(user);
    }

    @RequestMapping("/adminLogin")
    public Integer loginStudent(@RequestBody User user) {
        return userService.queryByNamePwd(user);
    }
}
