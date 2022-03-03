package com.hacademy.reflection4;

import java.lang.reflect.Field;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection4.Novel");
		
		System.out.println("<Accessible field list>");
		for(Field field : c.getFields()) {
			System.out.println(field);
		}
		
		System.out.println();
		System.out.println("<Declared field list>");
		for(Field field : c.getDeclaredFields()) {
			System.out.println(field);
		}
	}
}
