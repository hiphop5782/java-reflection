package com.hacademy.reflection4;

import java.lang.reflect.Field;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = Class.forName("com.hacademy.reflection4.Novel");
		
		Field f1 = c.getField("genre");
		System.out.println(f1);
		
//		Field f2 = c.getField("serial");//NoSuchFieldException 발생
//		System.out.println(f2);
		
//		Field f3 = c.getDeclaredField("genre");//NoSuchFieldException 발생
//		System.out.println(f3);
		
		Field f4 = c.getDeclaredField("serial");
		System.out.println(f4);
	}
}
