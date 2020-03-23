package com.hhqiwei.controller;

import com.hhqiwei.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user/*")
@RestController
public class UserController {

    @Autowired
    private DemoService demoService;


//    @GetMapping("test")
    @RequestMapping("test")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("test1")
    public String test1() {
        return demoService.test();
    }
}
