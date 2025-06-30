package com.shubham.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //To act as a client to eureka server
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
