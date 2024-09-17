package com.iiht.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {
	
	
	@GetMapping
	public String confirm()
	{
		return "Connected Hello Service 2 ----- Responding";
	}
	
	
	@GetMapping("/factorial/{num}")
	public int fact(@PathVariable int num)
	{
		int i ;
		int fact=1;
		for(i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		
		return fact;
		
	}
	

}
