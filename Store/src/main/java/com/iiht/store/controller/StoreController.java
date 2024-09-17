package com.iiht.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.store.entity.Apple;
import com.iiht.store.entity.Bread;
import com.iiht.store.entity.Chocolate;
import com.iiht.store.entity.Egg;
import com.iiht.store.entity.Milk;
import com.iiht.store.service.StoreService;

@RestController
@RequestMapping("/rest/api1.0/store")
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@PostMapping("/createEgg")
	public ResponseEntity<Egg> createEgg(@RequestBody Egg e1)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(storeService.createEgg(e1));
	}
	
	
	@GetMapping("/fetchEggs")
	public ResponseEntity<List<Egg>> getAllEggs()
	{
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getAllEggs());
	}
	
	
	// Milk class controller Implementation
	
	
	@PostMapping("/createMilk")
	public ResponseEntity<Milk> createMilk(@RequestBody Milk m1)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(storeService.createMilk(m1));
	}
	
	@GetMapping("/fetchMilk")
	public ResponseEntity<List<Milk>> getAllMilk()
	{
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getAllMilk());
	}
	
	
	// Chocolate Class implementation
	
	@PostMapping("/createChocolate")
	public ResponseEntity<Chocolate> createMilk(@RequestBody Chocolate c1)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(storeService.createChocolate(c1));
	}
	
	@GetMapping("/fetchChocolate")
	public ResponseEntity<List<Chocolate>> getAllChocolate()
	{
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getAllChocolate());
	}
	
	// Apple class implementations
	
	@PostMapping("/createApple")
	public ResponseEntity<Apple> createMilk(@RequestBody Apple a1)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(storeService.createApple(a1));
	}
	
	@GetMapping("/fetchApple")
	public ResponseEntity<List<Apple>> getAllapple()
	{
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getAllApple());
	}
	
	// Bread  Class Implementations
	@PostMapping("/createBread")
	public ResponseEntity<Bread> createBread(@RequestBody Bread b1)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(storeService.createBread(b1));
	}
	
	@GetMapping("/fetchBread")
	public ResponseEntity<List<Bread>> getAllBread()
	{
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getAllBread());
	}
	
	

}
