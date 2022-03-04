package com.hacademy.annotation;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

public class CustomAnnotationProcessor extends AbstractProcessor{
	
	@Override
	public Set<String> getSupportedAnnotationTypes() {
		System.out.println("getSupportedAnnotationTypes invoke");
		Set<String> s = new HashSet<>();
		s.add(TestEntity.class.getName());
		return s;
	}
	
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		System.out.println("-> Process start");
		for(TypeElement element : annotations) {
			System.out.println(element);
		}
		System.out.println("-> Process finish");
		return true;
	}
}
