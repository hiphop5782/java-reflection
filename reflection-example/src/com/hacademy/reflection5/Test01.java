package com.hacademy.reflection5;

import java.lang.reflect.Constructor;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection5.Product");
		
		System.out.println("<Accessible constructor list>");
		for(Constructor<?> constructor : c.getConstructors()) {
			System.out.println(constructor);
		}
		
		System.out.println("<Declared constructor list>");
		for(Constructor<?> constructor : c.getDeclaredConstructors()) {
			System.out.println(constructor);
		}
	}
}
