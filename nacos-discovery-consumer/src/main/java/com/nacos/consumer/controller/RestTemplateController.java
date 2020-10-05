package com.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: Sui, ChengBin
 * @Date: 2020/9/30
 **/
@RestController
public class RestTemplateController {

    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate;

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/echo/{message}")
    public String callEcho(@PathVariable String message){
        return restTemplate.getForObject("http://nacos-discovery-provider/echo/" + message, String.class);
    }

}
