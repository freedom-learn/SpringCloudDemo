package com.cloud.ribbon.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @author wangsong
 * @version 2.0
 * @date 2019/08/15 15:39:${SECONDS}
 * @since JDK1.8
 */
@Service
public class TestService {

    public String sayHello(){
        return "helloWorld"; // 提供一个hello World
    }
}
