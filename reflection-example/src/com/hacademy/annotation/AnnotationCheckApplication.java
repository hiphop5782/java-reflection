package com.hacademy.annotation;

import java.lang.annotation.Annotation;

public class AnnotationCheckApplication {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.hacademy.annotation.Item");
		Annotation annotation = c.getDeclaredAnnotation(TestEntity.class);
		if(annotation == null) {
			System.out.println("일반 클래스");
		}
		else {
			System.out.println("테스트 진행중인 클래스");
			TestEntity test = (TestEntity)annotation;
			System.out.println(test.author());
			System.out.println(test.date());
			System.out.println(test.comment());
		}
	}
}
