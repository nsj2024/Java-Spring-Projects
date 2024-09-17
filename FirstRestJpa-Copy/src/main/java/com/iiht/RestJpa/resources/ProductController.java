package com.iiht.RestJpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.RestJpa.entity.Product;
import com.iiht.RestJpa.service.ProductService;

@RestController
@RequestMapping("/product/api1.0")
public class ProductController {
	
	
	@Autowired 
	ProductService service;
	
	
	@PostMapping
	@RequestMapping(path = "create" , 
	consumes =MediaType.APPLICATION_JSON_VALUE ,
	produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq)
	{
		Product newProduct = service.save(productReq);
		return new ResponseEntity<Product>(newProduct,HttpStatus.CREATED);
	}

	
	@GetMapping("/fetch/{productId}")
	public ResponseEntity<Product> getProductbyId( @PathVariable Long productId)
	{
		return ResponseEntity.ok(service.fetch(productId));
	}
	

	@GetMapping("/fetch")
	public ResponseEntity<List<Product>> getAllproducts()
	{
		return ResponseEntity.ok(service.fetchAll());
	}
	
	
	@DeleteMapping ("/remove/{productId}")
	public ResponseEntity<String> removeById(@PathVariable Long productId)
	{
		if(service.removeById(productId) == true)
			return ResponseEntity.ok("Deleted");
		else
			return ResponseEntity.ok("Not Deleted");
	}
	
	
	@PutMapping("/update/{id}")

	public ResponseEntity<Product> upd(@PathVariable Long id, @RequestBody Product p ){

		Product op = service.updateProduct(id, p);

		return new ResponseEntity<Product>(op,HttpStatus.OK);

	}


	
}

