package com.qf.mapper;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    Integer addUser(@Param("user") User user);
    Integer queryByNamePwd(@Param("admin") User user);
}
