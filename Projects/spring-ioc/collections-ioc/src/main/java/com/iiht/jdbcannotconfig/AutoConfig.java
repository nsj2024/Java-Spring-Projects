package com.iiht.jdbcannotconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.iiht.jdbcannotconfig")
@PropertySource("classpath:application.properties")
public class AutoConfig {
	
	@Value("${jdbc.url}") String jdbcurl;
	@Value("${jdbc.username}") String username;
	@Value("${jdbc.password}") String password;
	
	@Bean("connection")
	public JDBCConnectionUtil createUtil() {
		return new JDBCConnectionUtil(jdbcurl, username, password);
																																	
	}
	
}
