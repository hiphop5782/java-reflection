package com.hacademy.reflection5;

public class Product {
	private String name;
	private String type;
	private int price;
	
	private Product() {
		this("미설정", "없음", 0);
	}
	public Product(String name) {
		this(name, "없음", 0);
	}
	public Product(String name, String type) {
		this(name, type, 0);
	}
	public Product(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
}
