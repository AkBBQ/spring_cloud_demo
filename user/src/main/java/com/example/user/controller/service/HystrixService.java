package com.example.user.controller.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * hystrix 降级简单例子
 * @author angtai
 */

@Service
public class HystrixService {


    @HystrixCommand(fallbackMethod = "fallback")
    public  String hi() {
        return new RestTemplate().getForObject("http://localhost:8090/exception", String.class);
    }

    public String fallback() {
        return "调用失败 出错了 ";
    }
}