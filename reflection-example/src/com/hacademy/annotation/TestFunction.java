package com.hacademy.annotation;

public class TestFunction {
	@TestInProgress(tester = "Hacademy")
	public static void print() {
		System.out.println("Hello world!");
	}
}
