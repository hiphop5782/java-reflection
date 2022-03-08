package com.hacademy.reflection5;

import java.lang.reflect.Constructor;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> c = Class.forName("com.hacademy.reflection5.Product");
		
//		Constructor<?> c1 = c.getConstructor();//error
		Constructor<?> c2 = c.getConstructor(String.class);
		Constructor<?> c3 = c.getConstructor(String.class, String.class);
		Constructor<?> c4 = c.getConstructor(String.class, String.class, int.class);
		
		Constructor<?> c5 = c.getDeclaredConstructor();
		Constructor<?> c6 = c.getDeclaredConstructor(String.class);
		Constructor<?> c7 = c.getDeclaredConstructor(String.class, String.class);
		Constructor<?> c8 = c.getDeclaredConstructor(String.class, String.class, int.class);
		
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		System.out.println("c7 = " + c7);
		System.out.println("c8 = " + c8);
	}
}
