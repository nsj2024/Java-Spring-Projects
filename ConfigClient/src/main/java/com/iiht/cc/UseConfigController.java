package com.iiht.cc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readpros")
public class UseConfigController {
	@Value("${server.port.key}") String serverport;
	
	@Value("${spring.application.name}") String appName;
	
	@GetMapping
	public String showProps() {
		return "port = "+ serverport + "------ App Name  =" + appName;
	}
}
