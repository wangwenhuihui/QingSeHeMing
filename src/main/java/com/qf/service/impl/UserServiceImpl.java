package com.qf.service.impl;

import com.qf.entity.User;
import com.qf.mapper.IUserMapper;
import com.qf.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        Integer rSet = userMapper.addUser(user);
        return rSet;
    }

    @Override
    public Integer queryByNamePwd(User user) {
        Integer rSet = userMapper.queryByNamePwd(user);
        return rSet;
    }
}
