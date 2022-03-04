package com.hacademy.annotation3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Developers {
	public @interface Developer {
		String name();
		String department() default "";
		String comment() default "";
	}
	Developer[] value();
}
