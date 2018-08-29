package com.sringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class SringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SringcloudApplication.class, args);
	}
}
