package com.hhqiwei.entity;

import lombok.Data;

import java.util.List;
@Data
public class PageResult <T> {
    private long total;
    private List<T> rows;
}
