package day8.com.cdac.shape.objects;

public class Rectangle extends Shape {

	int breadth;
	int length;

	
	public Rectangle() {
		super();
	}

	public Rectangle(int breadth, int length) {
		super();
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return breadth * length;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return breadth + length + breadth + length;
	}
	
	public void draw() {
		System.out.println("No need to draw real Rectangle just print message");
	}

}
