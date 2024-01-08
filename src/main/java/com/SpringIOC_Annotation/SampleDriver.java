package com.SpringIOC_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleDriver {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		Sample s=(Sample)ac.getBean("sample");
		
		s.test();

	}

}
