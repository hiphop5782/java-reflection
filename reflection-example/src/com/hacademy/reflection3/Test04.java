package com.hacademy.reflection3;

import java.lang.reflect.Method;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.reflection3.Member");
		
		System.out.println("<accessible method information>");
		for(Method method : c.getMethods()) {
			System.out.println(method);
		}
		
		System.out.println("<declared method information>");
		for(Method method : c.getDeclaredMethods()) {
			System.out.println(method);
		}
		
	}
}
