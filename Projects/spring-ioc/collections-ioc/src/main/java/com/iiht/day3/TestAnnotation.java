package com.iiht.day3;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestAnnotation {
	public static void main(String[] args) {
		Logger l2 = Logger.getLogger("TestCompo");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);
		l2.info(context+"");
		//l2.info(context.getBean(Point.class)+"");
		
		Line l1 = (Line) context.getBean("Line");
		l2.info(l1.toString()+"");
		
	}

}
