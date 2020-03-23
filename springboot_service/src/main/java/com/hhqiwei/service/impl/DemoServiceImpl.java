package com.hhqiwei.service.impl;

import com.hhqiwei.entity.pojo.TbUser;
import com.hhqiwei.entity.pojo.TbUserExample;
import com.hhqiwei.entity.pojo.Test;
import com.hhqiwei.service.DemoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hhqiwei.entity.mapper.*;

import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    TestMapper testMapper;
    TbUserMapper tbUserMapper;

    @Override
    public String test() {
        int account = testMapper.deleteByPrimaryKey(1);
        TbUser tbUser=new TbUser();
        tbUser.setUserNo("user-54545");
        tbUser.setMobile("15778094652");
        tbUser.setUserName("hhqiwei");
        tbUser.setPassWord("123456");
        tbUser.setEmail("814047362@qq.com");
        tbUser.setAvatar("13423");
        return "interface test"+account+tbUser.toString();
    }
}
