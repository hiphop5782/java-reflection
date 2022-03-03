package com.hacademy.reflection4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException{
		Class<?> c = Class.forName("com.hacademy.reflection4.Novel");
		
		Novel novel = (Novel)c.getDeclaredConstructor().newInstance();
		
		Field serial = c.getDeclaredField("serial");
		serial.setAccessible(true);
		serial.set(novel, "TEST-SERIAL");
		
		Field publishDate = c.getDeclaredField("publishDate");
		publishDate.set(novel, new Date());
		
		Field price = c.getDeclaredField("price");
		price.set(novel, 5000);
		
		Field comment = c.getDeclaredField("comment");
		comment.set(novel, "테스트용 서적 정보");
		
		System.out.println(novel);
	}
}
