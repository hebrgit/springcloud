package com.hebo.springcloudapi.dto;

import lombok.Data;

/**
 * @author HEBO
 */
@Data
public class ResponseDto<T> {

    private Integer code;
    private String msg;
    private T Data;
}
