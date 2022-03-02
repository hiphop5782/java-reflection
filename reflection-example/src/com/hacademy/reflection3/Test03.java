package com.hacademy.reflection3;

import java.lang.reflect.Field;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection3.Member");
		
		System.out.println("<accessible field information>");
		for(Field field : c.getFields()) {
			System.out.println(field);
		}
		
		System.out.println("<declared field information>");
		for(Field field : c.getDeclaredFields()) {
			System.out.println(field);
		}
		
	}
}
