package com.hacademy.reflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test02 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<Student> clazz = Student.class;
		Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, int.class);
		constructor.setAccessible(true);
		Student stu = constructor.newInstance("피카츄", 100);
		System.out.println(stu.toString());
	}
}
