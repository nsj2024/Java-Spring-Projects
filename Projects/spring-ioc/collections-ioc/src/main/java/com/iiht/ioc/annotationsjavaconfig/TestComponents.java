package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponents {
	
	public static void main(String[] args) {
		Logger l2 = Logger.getLogger("TestCompo");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		l2.info(context+"");
		l2.info(context.getBean(AtntSim.class)+"");
		l2.info(context.getBean("atntSim")+"");
		Mobile iphone13 = (Mobile) context.getBean("iphone13");
		iphone13.turnOn();
	}

}
