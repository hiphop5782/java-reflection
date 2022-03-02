package com.hacademy.reflection3;

public class Test02 {
	public static void main(String[] args) {
		if(args.length != 2) throw new IllegalArgumentException("usage : java Test02 [basePackage] [className]");
		
		String basePackage = args[0];
		String className = args[1];
		String fullPath = basePackage+"."+className;
		try {
			Class<?> c = Class.forName(fullPath);
			System.out.println("c = " + c);
		}
		catch(ClassNotFoundException e) {
			System.err.println("잘못된 클래스 경로");
		}
	}
}
