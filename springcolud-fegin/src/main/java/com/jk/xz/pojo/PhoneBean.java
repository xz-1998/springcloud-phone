package com.jk.xz.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class PhoneBean implements Serializable {
    private Integer id;
    private String name;
    private Integer type;
    private Integer price;
    private String size;
    private String date;

    //业务字段
    private Integer page;
    private Integer rows;
    private String sdate;
    private String edate;
}
