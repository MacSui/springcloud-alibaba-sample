package com.dubbo.provider.service;

import com.alibaba.cloud.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description:
 * @Author: Sui, ChengBin
 * @Date: 2020/10/1
 **/
@Service
public class SimpleEchoService implements EchoService {
    @Override
    public String echo(String s) {
        System.out.println("********simple echo service......"+s);
        return "[Echo]: " + s;
    }
}
