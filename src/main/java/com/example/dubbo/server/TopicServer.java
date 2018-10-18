package com.example.dubbo.server;

import com.example.dubbo.vo.Topic;

/**
 * @author yushengma
 * 消费端与客户端接口包位置必须一致，否则找不到抛异常
 */
public interface TopicServer {
    Topic getTopic(String name);
}
