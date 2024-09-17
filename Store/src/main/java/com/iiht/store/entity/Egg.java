package com.iiht.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Egg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long batchId;
	private String type;
	private Long quantity;
	private double price;
	private String shelfLife;
}
