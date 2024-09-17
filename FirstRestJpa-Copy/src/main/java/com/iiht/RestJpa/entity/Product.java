package com.iiht.RestJpa.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	
	
	@Id
	private Long productId;
	private String description;
	private double price;
	private String name;
	private String newVarible;
	

}
