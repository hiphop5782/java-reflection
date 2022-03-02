package com.hacademy.reflection3;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<? extends Member> a = new Member().getClass();
		Class<Member> b = Member.class;
		Class<?> c = Class.forName("com.hacademy.reflection3.Member");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
