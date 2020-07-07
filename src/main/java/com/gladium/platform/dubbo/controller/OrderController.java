package com.gladium.platform.dubbo.controller;

import com.gladium.platform.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gladium
 * @version v1.0
 * @date 2020/7/7 19:10
 * @description TODO
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("query")
    public String query(){
        return orderService.query();
    }

}
