package com.ust.resl4jClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloserviceResl4jClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceResl4jClient1Application.class, args);
	}

	
	@Bean
	public RestTemplate newTemplate()
	{
		return new RestTemplate();
	}
}
