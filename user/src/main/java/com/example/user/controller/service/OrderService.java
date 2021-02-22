package com.example.user.controller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.sun.cloud_client2.controller.service
 * @author: angtai（angtai@maihaoche.com）
 * @date: 2020/3/16 4:49 PM
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
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
