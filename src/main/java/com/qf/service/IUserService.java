package com.qf.service;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService  {
    Integer addUser(User user);
    Integer queryByNamePwd(User user);
}
