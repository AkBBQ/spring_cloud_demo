package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.example.order.controller
 * @author: angtai（angtai@maihaoche.com）
 * @date: 2021/2/21 9:38 下午
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 */

@RestController
public class IndexController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 提供接口给外部调用
     * @return
     */
    @RequestMapping("/welcomeToOrder")
    public String hello(){
        return "欢迎来到配置client";
    }


    /**
     * 调用外部接口
     * REST实现
     * @return
     */
    @RequestMapping("/doRpc")
    public String test(){
        return restTemplate.getForObject("https://user-system/welcomeToUser",String.class);
    }



}