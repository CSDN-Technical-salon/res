package com.nuister.salon.res;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ResApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResApplication.class, args);
	}

}
