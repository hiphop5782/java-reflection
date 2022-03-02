package com.hacademy.reflection1;

import java.lang.reflect.InvocationTargetException;

public class Test02 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<Student> clazz = Student.class;
		Student stu = clazz.getDeclaredConstructor().newInstance();
		stu.setName("피카츄");
		stu.setScore(100);
		System.out.println(stu.toString());
	}
}
