package com.java.test0;

public class Crectangle {

	int lenth, width;

	public Crectangle(int lenth, int width) {
		this.lenth = lenth;
		this.width = width;
	}

	public int Perimeter() {
		return 2 * (lenth + width);
	}

	public int Area() {
		return lenth * width;
	}

}
