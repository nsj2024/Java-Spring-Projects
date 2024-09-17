package com.ust.msg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderStatus {
	
	
	private PurchaseOrder order;
	private String status;
	private String message;

}
