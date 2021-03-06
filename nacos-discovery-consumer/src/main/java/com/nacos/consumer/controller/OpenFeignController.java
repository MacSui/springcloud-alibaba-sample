package com.nacos.consumer.controller;

import com.nacos.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Sui, ChengBin
 * @Date: 2020/9/30
 **/
@RestController
public class OpenFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping("/feign/echo/{message}")
    public String feignEcho(@PathVariable String message){
        return echoService.echo(message);
    }


}
