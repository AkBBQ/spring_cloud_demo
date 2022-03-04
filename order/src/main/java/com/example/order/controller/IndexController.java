package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    RestTemplate restTemplate;

    /**
     * 提供接口给外部调用
     * @return
     */
    @RequestMapping("/welcomeToOrder")
    public String hello(){
        return "欢迎来到订单系统";
    }


    /**
     * 调用外部接口
     * REST实现
     * @return
     */
    @RequestMapping("/doRpc")
    public String test(){
        return restTemplate.getForObject("http://user-system/welcomeToUser",String.class);
    }


    /**
     * 演示user系统2个有问题的接口
     */

    /**
     * 超时接口
     *
     * @return
     */
    @RequestMapping(value = "/timeout", method = RequestMethod.GET)
    public String timeout() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时了";
    }

    /**
     * 超时接口
     *
     * @return
     */
    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exception() {
        if (true) {
            throw new RuntimeException("异常咯");
        }
        return "异常";
    }

}