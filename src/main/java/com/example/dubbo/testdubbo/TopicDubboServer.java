package com.example.dubbo.testdubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.server.TopicServer;
import com.example.dubbo.vo.Topic;
import org.springframework.stereotype.Component;

/**
 * @author yushengma
 */
@Component
public class TopicDubboServer {

    @Reference
    TopicServer topicServer;

    public void printTopic() {
        Topic topic = topicServer.getTopic("topic1");
        System.out.println("==================================Topic: " + topic.toString());
    }
}
