package com.hebo.springcloudapi.entites;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dept implements Serializable {

    private Integer id;
    private String deptId;
    private String deptName;
}
