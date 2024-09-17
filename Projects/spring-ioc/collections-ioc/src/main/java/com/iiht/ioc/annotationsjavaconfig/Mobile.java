package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("iphone13")
public class Mobile {
	Logger logger = Logger.getLogger("Mobile");
	@Autowired
	private Sim simcard;
	
	public void turnOn() {
		boolean status = simcard.connect();
		logger.info(status ? "connected" : "not connected");
	}
	
}
