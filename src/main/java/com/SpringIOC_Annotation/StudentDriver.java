package com.SpringIOC_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		Student s=(Student)ac.getBean("student");
		
		System.out.println();
	}

}
