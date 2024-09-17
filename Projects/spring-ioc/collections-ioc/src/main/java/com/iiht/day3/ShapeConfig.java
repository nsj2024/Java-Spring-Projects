package com.iiht.day3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iiht.day3")
public class ShapeConfig {
	
	@Bean(name="p1")
	public Point createPoint() {
		return new Point(12.5,19.5);
	}
	
	
	  @Bean(name="p2") public Point createPoint1() { return new Point(14.5, 21.5);
	  }
	 
}
