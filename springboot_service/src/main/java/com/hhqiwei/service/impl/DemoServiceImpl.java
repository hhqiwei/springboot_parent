package com.hhqiwei.service.impl;

import com.hhqiwei.entity.pojo.Test;
import com.hhqiwei.service.DemoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hhqiwei.entity.mapper.*;
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    TestMapper testMapper;

    @Override
    public String test() {
        int account = testMapper.deleteByPrimaryKey(1);
        return "interface test"+account;
    }
}
