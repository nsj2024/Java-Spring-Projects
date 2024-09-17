package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class TestController {

	
	
	@Autowired
	Environment enviroment;
	
	@GetMapping()
	public String welcome() {
		String port = enviroment.getProperty("local.server.port");
		return "Programming microservice LBSERVICE port# " + port;
	}

}
