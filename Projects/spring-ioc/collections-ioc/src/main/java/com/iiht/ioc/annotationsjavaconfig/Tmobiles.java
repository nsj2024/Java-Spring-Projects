package com.iiht.ioc.annotationsjavaconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tmobile")
@Primary
public class Tmobiles implements Sim{

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return true;
	}

}
