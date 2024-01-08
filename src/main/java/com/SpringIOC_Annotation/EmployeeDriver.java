package com.SpringIOC_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		Employee e=(Employee)ac.getBean("employee");
		
		System.out.println(e.getName()+" "+e.getSalary());

	}
}
