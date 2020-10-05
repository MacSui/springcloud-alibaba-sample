package com.nacos.nacosdiscoveryprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Sui, ChengBin
 * @Date: 2020/9/30
 **/
@RestController
public class ServiceController {
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message){
        return "[ECHO] : " + message;
    }
}
