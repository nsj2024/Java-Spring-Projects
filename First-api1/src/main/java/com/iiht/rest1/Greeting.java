package com.iiht.rest1;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api3.0")
public class Greeting {
	
	
	@GetMapping
	@RequestMapping
	public ResponseEntity<String> greetLocale(@RequestHeader HttpHeaders headers )
	{
		 HashMap<String,String> greeting = new HashMap<>();
		 greeting.put("US","hello US");
		 greeting.put("IN","Namaste");
		 greeting.put("UK", "Hi");
		
		 String localeValue = headers.get("locale").get(0);
		
		 
			 if(localeValue != null && greeting.containsKey(localeValue))
				 return ResponseEntity.status(HttpStatus.OK).body(greeting.get(localeValue));
				 else
					 return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Not available");
		 

}}
