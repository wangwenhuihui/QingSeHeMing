package com.qf.entity;

import lombok.Data;

@Data
public class Photo {
    private Integer photoId;
    private Integer userId;
    private String photoName;
    private Integer albumType;
    private Integer isDelete;

}
