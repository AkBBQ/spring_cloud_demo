package com.example.user.controller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * AFeign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，
 * 只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 *
 * 简而言之：
 *
 * ·Feign 采用的是基于接口的注解
 *
 * ·Feign 整合了ribbon
 * ————————————————
 * 版权声明：本文为CSDN博主「我想E得足够快」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/weixin_44448094/article/details/88535475
 */

@Service
@FeignClient("order-system")
public interface OrderService {

    /**
     * 订单系统的接口
     * @return
     */
    @RequestMapping("welcomeToOrder")
     String testConOrder();
}
