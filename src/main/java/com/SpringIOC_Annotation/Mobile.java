package com.SpringIOC_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	Sim sim;
	
	public void show() {
		System.out.println("Mobile class method");
	}

}
