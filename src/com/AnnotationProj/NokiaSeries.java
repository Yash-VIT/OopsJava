package com.AnnotationProj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String OS() default "Candy";
	int version() default 1;
}

@SmartPhone(OS="KitKat", version=9)

public class NokiaSeries {
	
	String model;
	int size;
	
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}

	public void print() {
		System.out.println("The Model is :"+model+" The size is :"+size);
	}
	
}
