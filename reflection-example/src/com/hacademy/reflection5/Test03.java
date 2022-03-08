package com.hacademy.reflection5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.hacademy.reflection5.Product");
		Constructor<?> constructor = c.getDeclaredConstructor();
		constructor.setAccessible(true);
		Product product = (Product) constructor.newInstance();
		System.out.println(product);
	}
}
