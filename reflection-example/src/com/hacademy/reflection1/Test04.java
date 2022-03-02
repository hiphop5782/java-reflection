package com.hacademy.reflection1;

import java.lang.reflect.InvocationTargetException;

public class Test04 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<Student> clazz = Student.class;
		Student stu = clazz.getDeclaredConstructor(String.class, int.class).newInstance("피카츄", 100);
		System.out.println(stu.toString());
	}
}
