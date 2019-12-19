package com.qf.entity;

import lombok.Data;

@Data
public class Mail {
    private Integer mailId;
    private Integer userId;
    private Integer receiverId;
    private String content;
    private Integer state;
    private Integer isDelete;

}
