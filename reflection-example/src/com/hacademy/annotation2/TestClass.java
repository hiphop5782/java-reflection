package com.hacademy.annotation2;

import java.util.List;

@TypeAnnotation
@AnnotationTypeAnnotation
@interface TestAnnotation {
	
}

@TypeAnnotation
@TypeUseAnnotation
public class TestClass {

	@FieldAnnotation
	@TypeUseAnnotation
	private String fieldExample;
	
	@MethodAnnotation
	//public int methodExample(int a, int b)
	public @TypeUseAnnotation int methodExample(@ParameterAnnotation int a, @TypeUseAnnotation int b) {
		@LocalVariableAnnotation
		int total = a + b;
		return total;
	}
	
	@ConstructorAnnotation
	//public Testclass(String arg0, String arg1)
	public TestClass(@ParameterAnnotation String arg0, @TypeUseAnnotation String arg1) {
		
	}
	
	//public static <T>T genericMethodExample(T a)
	public static <@TypeParameterAnnotation T> @TypeUseAnnotation T genericMethodExample(@TypeUseAnnotation T a){
		System.out.println(a);
		return a;
	}
	
}
