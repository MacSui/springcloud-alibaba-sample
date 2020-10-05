package com.alibaba.cloud.dubbo;

import com.alibaba.cloud.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableAutoConfiguration
@RestController
public class DubboConsumerApplication {

    @Reference
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(@RequestParam(name="message") String message){
        return echoService.echo(message);
    }


    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

}
