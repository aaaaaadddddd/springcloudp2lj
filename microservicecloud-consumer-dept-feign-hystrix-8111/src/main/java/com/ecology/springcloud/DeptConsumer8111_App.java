package com.ecology.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.ecology.springcloud"})
public class DeptConsumer8111_App
{
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer8111_App.class, args);
	}
}
