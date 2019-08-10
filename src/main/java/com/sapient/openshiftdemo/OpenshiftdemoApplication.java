package com.sapient.openshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OpenshiftdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftdemoApplication.class, args);
	}
	@Bean
    public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
