package com.hacademy.reflection3;

import java.lang.annotation.Annotation;

public class Test06 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection3.Member");
		
		System.out.println("<annotation information>");
		for(Annotation annotation : c.getAnnotations()) {
			System.out.println(annotation);
		}
	}
}
