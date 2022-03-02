package com.hacademy.reflection3;

import java.lang.reflect.Constructor;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection3.Member");
		
		System.out.println("<constructor information>");
		for(Constructor<?> constructor : c.getConstructors()) {
			System.out.println(constructor);
		}
		
	}
}
