package com.cloud.ribbon.ribbon.controller;

import com.cloud.ribbon.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangsong
 * @version 2.0
 * @date 2019/08/15 15:40:${SECONDS}
 * @since JDK1.8
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @GetMapping("/hello")
    public String sayHello(String name){
        return testService.sayHello() + " " + name;
    }
}
