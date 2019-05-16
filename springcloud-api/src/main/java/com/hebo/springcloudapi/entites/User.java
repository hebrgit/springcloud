package com.hebo.springcloudapi.entites;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HEBO
 */
@Data

public class User implements Serializable {

    private Integer id;

    private String UID;

    private String userName;

    private Integer age;
    /**
     *  0代表男性，1代表女性
     */

    private Integer sex;

    private Date brithy;

    private String deptId;

    private String db;
}
