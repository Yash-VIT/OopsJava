package com.AnnotationProj;

import java.lang.annotation.Annotation;

public class NokiaSeriesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NokiaSeries ns = new NokiaSeries("Cookie", 10);
		ns.print();
		Class c = ns.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone) an;
		System.out.println(s.OS());
		System.out.println(s.version());

	}

}
