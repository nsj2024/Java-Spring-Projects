package com.iiht.ioc2;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iiht.ioc.Members;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l = Logger.getLogger("Line");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    Object obj = context.getBean("L");
	    Line team = (Line) obj;
	    //System.out.println(team);
	    l.info(team + "");
	    
	    

	}

}
