package com.SpringIOC_Annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	String name;
	String address;
	
	public Student(@Value(value="Ram") String name,@Value(value="Bangalore") String address) {
		super();
		this.name=name;
		this.address=address;
	}

}
