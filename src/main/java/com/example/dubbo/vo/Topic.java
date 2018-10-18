package com.example.dubbo.vo;

import java.io.Serializable;

/**
 * @author yushengma
 * 传递类需实现serializable接口，序列化、反序列化
 */
public class Topic implements Serializable{
    private String name;
    private String channel;
    private String system;

    public Topic() {
    }

    public Topic(String name, String channel, String system) {
        this.name = name;
        this.channel = channel;
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                ", channel='" + channel + '\'' +
                ", system='" + system + '\'' +
                '}';
    }
}
