package com.hacademy.reflection3;

import java.lang.reflect.Constructor;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection3.Member");
		
		System.out.println("<accessible constructor information>");
		for(Constructor<?> constructor : c.getConstructors()) {
			System.out.println(constructor);
		}
		
		System.out.println("<declared constructor information>");
		for(Constructor<?> constructor : c.getDeclaredConstructors()) {
			System.out.println(constructor);
		}
		
	}
}
