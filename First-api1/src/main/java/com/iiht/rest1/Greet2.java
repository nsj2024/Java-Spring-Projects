package com.iiht.rest1;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Handler - endpoints - API

@RestController
@RequestMapping("/rest/api2.0")
public class Greet2 {
	
	@GetMapping
	@RequestMapping("/welcome")
	public ResponseEntity<String> greet()
	{
		ResponseEntity<String> response = new ResponseEntity<>("First Api !" , HttpStatus.OK);
		return response;
	}

	
	  @GetMapping
	  
	  @RequestMapping("/time") 
	  public ResponseEntity<String> getTime()
	  {
		  
		 // ResponseEntity<String> response = new ResponseEntity<>(); using static methods
		  return ResponseEntity.status(HttpStatus.OK).body(Calendar.getInstance().getTime() + "");
	  }
	  
	  
	  
	  @GetMapping
	  
	  @RequestMapping("/{gender}") 
	  public String genderMessage1(@PathVariable String gender) 
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
	  public ResponseEntity<String> genderMessage2(@RequestHeader HttpHeaders headers ,@PathVariable String name , @PathVariable String gender) 
	  {
		 Set<String> set =headers.keySet();		 
		 Iterator <String> keys = set.iterator();
		 
		 String keyStr = null;
		 while(keys.hasNext())
		 {
			 keyStr += keys.next() + "\n";		 
	     }
		 
		 Set<Entry<String,List<String>>> entries = headers.entrySet();
		 Iterator iter2 = entries.iterator();
		 
		 String keyValueStr = null;
		 while(iter2.hasNext())
		 {
			 keyValueStr += iter2.next() + "<br/>";
		 }
		 
		 //return keyStr;
		 HttpHeaders headers2 = new HttpHeaders();
		 headers.setAcceptLanguageAsLocales(null);
		 headers2.setContentType(MediaType.TEXT_HTML);
		 headers2.setContentLength(keyValueStr.length());
		 headers2.set("ust", "GammaTraining#6");
		 
		 
		 return ResponseEntity.status(HttpStatus.OK).headers(headers2).body(keyValueStr);	
	  }
	  
	  @RequestMapping("/namegender")
	  public ResponseEntity<String> genderMessage3(@RequestBody Member member) 
	  {
		  if(member.getGender().equals("Female"))
			  return ResponseEntity.ok("Welcome miss." + member.getName());
		  else if(member.getGender().equals("Male"))
			  return ResponseEntity.ok("Welcome mr." + member.getName());
		  else
			  return ResponseEntity.ok("Welcome" + member.getName());
	  }
	 
}
