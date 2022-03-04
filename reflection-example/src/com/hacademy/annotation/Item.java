package com.hacademy.annotation;

@TestEntity(author = "hacdemy", date = "2022-03-03", comment = "테스트를 위한 Annotation")
public class Item {
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
