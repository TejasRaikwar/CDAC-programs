package com.cdac.shape.objects;

public class Circle extends Shape {
	int radius = 0;

	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius;
	}

	public void draw() {
		System.out.println("No need to draw real Circle just print message");
	}

}
