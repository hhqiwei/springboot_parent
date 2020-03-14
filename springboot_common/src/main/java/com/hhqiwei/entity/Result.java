package com.hhqiwei.entity;

import lombok.Data;
import lombok.Getter;

@Data
public class Result {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;
}
