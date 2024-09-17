package com.iiht.ioc.annotations;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnnotations {
	Logger l = Logger.getLogger("LifeCycle");
	
	
	public LifeCycleAnnotations() {
		// TODO Auto-generated constructor stub
		l.info("from default constructor");
	}
	
	@PostConstruct
	public void myInit() {
		l.info("Init Called");
	}
	
	@PreDestroy
	public void myDestroy() {
		l.info("Destroy Called");
	}
}
