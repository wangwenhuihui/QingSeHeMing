package com.qf.entity;

import lombok.Data;

@Data
public class User {
    private Integer uId;
    private String username;
    private String password;
    private String picture;
    private String nickname;
    private String sex;
    private String education;
    private Integer age;
    private String birthday;
    private String maritalStatus;
    private Double height;
    private Double income;
    private String tel;
    private String introduction;
    private Integer level;
    private Integer albumId;
    private Integer isPaired;
    private Integer isDelete;

}
