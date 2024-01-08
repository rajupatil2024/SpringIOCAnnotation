package com.SpringIOC_Annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Flower {
	
	public void color() {
		System.out.println("Flower is Red");
	}

}
