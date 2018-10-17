package com.example.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.example.dubbo.server.UserDubboServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yushengma
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DubboApplication.class, args);
		UserDubboServer userDubboServer = run.getBean(UserDubboServer.class);
		userDubboServer.printUser();
	}
}
