package com.iiht.ioc.annotations;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotations {
	public static void main(String[] args) {
		Logger l1 = Logger.getLogger("TestAnnotation");
		
		ClassPathXmlApplicationContext cc  = new ClassPathXmlApplicationContext("beans.xml");
		
		Object obj = cc.getBean(LifeCycleAnnotations.class);
		l1.info(obj+"");
	}
}
