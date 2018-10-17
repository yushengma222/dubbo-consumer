package com.example.dubbo.server;

import com.example.dubbo.vo.User;

/**
 * @author yushengma
 */
public interface UserServer {
    User getByName(String name);
}
