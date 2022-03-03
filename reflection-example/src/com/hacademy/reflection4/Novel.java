package com.hacademy.reflection4;

import java.util.Date;

public class Novel extends Book{
	private String serial;
	Date publishDate;
	protected int price;
	public String comment;
	@Override
	public String toString() {
		return "Novel [serial=" + serial + ", publishDate=" + publishDate + ", price=" + price + ", comment=" + comment + "]";
	}
}
