package com.iiht.helloclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {
	
	
	@Autowired
	RestTemplate template;
	
	
	@GetMapping
	public ResponseEntity<String> connect()
	{
		String url ="http://localhost:8070/rest/service";
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		return response;
//		return response.toString();
	}
	
	@GetMapping("/factorial/{num}")
	public ResponseEntity<Integer> connect1(@PathVariable int num)
	{
		String url ="http://localhost:8070/rest/service/factorial/" + num;
		ResponseEntity<Integer> response = template.getForEntity(url, Integer.class);
		return response;
//		return response.toString();
	}
	
	
	

}
