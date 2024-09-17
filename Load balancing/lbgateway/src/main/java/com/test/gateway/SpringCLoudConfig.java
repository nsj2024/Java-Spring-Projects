package com.test.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCLoudConfig {
	
	@Bean
	RouteLocator gatewayRoutes(RouteLocatorBuilder builder)
	{
		return 
				builder.routes()
					   .route("LBSERVICE",r->r.path("/test/**")
					   .uri("lb://LBSERVICE"))	
					   
					   .route("LBSERVICE2",r->r.path("/test2/**")
					   .uri("lb://LBSERVICE2"))	
					   .build();	
	}

}
