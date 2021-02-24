package com.example.user.controller;

import com.example.user.controller.service.HystrixService;
import com.example.user.controller.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.sun.cloud_client2.controller
 * @author: angtai（angtai@maihaoche.com）
 * @date: 2020/3/16 4:11 PM
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 */

@RestController
public class IndexController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private HystrixService hystrixService;

    /**
     * 对外部提供的接口
     *
     * @return
     */
    @RequestMapping(value = "/welcomeToUser", method = RequestMethod.GET)
    public String test() {
        return "这里是用户系统 欢迎你";
    }

    /**
     * 调用外部的接口
     * <p>
     * 通过Feigin调用其他cloud的接口
     * <p>
     * Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单
     * 。使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
     * Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
     *
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test2() {
        return orderService.testConOrder();
    }


    @RequestMapping(value = "/testHystrix", method = RequestMethod.GET)
    public String test3() {
        return hystrixService.hi();
    }



}