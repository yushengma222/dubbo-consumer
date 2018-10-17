package com.example.dubbo.server;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.vo.User;
import org.springframework.stereotype.Service;

/**
 * @author yushengma
 */
@Service
public class UserDubboServer {

    @Reference
    UserServer userServer;

    public void printUser(){
        User user = userServer.getByName("libai");
        System.out.println("========================= " + user.toString());
    }
}
