package com.iiht.rest1;

import java.util.Calendar;
import java.util.HashMap;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Handler - endpoints - API

@RestController
@RequestMapping("/rest/api1.0")
public class Greet {
	
	@GetMapping
	@RequestMapping("/welcome")
	public String greet()
	{
		return "First API";
	}

	@GetMapping
	@RequestMapping("/time")
	public String getTime()
	{
		return Calendar.getInstance().getTime() + "";
	}
	
	
	
	@GetMapping
	@RequestMapping("/{gender}")
	public String genderMessage(@PathVariable String gender)
	{
		if(gender.equals("Female"))
			return "Welcome Miss";
		if(gender.equals("Male"))
			return "Welcome MR";
		else
			return "Welcome";
	}
	
	@GetMapping
	@RequestMapping("/namegender/{name}/{gender}")
	public String genderMessage(@PathVariable String name , @PathVariable String gender)
	{
		if(gender.equals("Female"))
			return "Welcome Miss." + name ;
		if(gender.equals("Male"))
			return "Welcome MR." + name;
		else
			return "Welcome" + name;
	}
	
	

}
