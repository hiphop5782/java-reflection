package com.hacademy.reflection5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.hacademy.reflection5.Product");
		Constructor<?> constructor = c.getDeclaredConstructor(String.class, String.class);
		Product product = (Product) constructor.newInstance("컴퓨터", "전자제품");
		System.out.println(product);
	}
}
