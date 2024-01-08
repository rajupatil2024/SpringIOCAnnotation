package com.SpringIOC_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		Mobile m=(Mobile)ac.getBean("mobile");
		
		m.show();
		
		m.sim.status();

	}

}
