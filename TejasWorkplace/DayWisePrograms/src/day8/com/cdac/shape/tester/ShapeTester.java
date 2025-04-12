package com.cdac.shape.tester;

import java.util.Scanner;

import com.cdac.shape.objects.Circle;
import com.cdac.shape.objects.Rectangle;
import com.cdac.shape.objects.Shape;

/*Create Shape class with abstract methods as
1. double calculateArea();
2. double calculatePerimeter();

Override these methods in child classes like Rectangle and Circle.
Add additional method in Circle class as void draw() with message(
No need to draw real Circle just print message)
Create circle object and have Shape reference to it.
Call the draw method of circle with specific circle reference after
down casting from Shape reference
Make is menu driven.*/
public class ShapeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;

		int op ;
		
		do {
			System.out.println("Enter Option\n1.Create Circle\n2.Create Rectangle \n3.Calculate Area\n4.Calculated Perimeter\n5.Draw Shape\n0.Exit");
			op = sc.nextInt();
		switch (op) {
		case 1: {
			System.out.println("Enter the radius :");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			System.out.println("Circle created");

			break;
		}
		case 2: {
			System.out.println("Enter the length :");
			int length = sc.nextInt();
			System.out.println("Enter the breadth :");
			int breadth = sc.nextInt();

			shape = new Rectangle(length, breadth);
			System.out.println("Rectangle created");

			break;
		}
		case 3: {
			if (shape == null) {
				break;
			}
			System.out.println("Area of shape : " + shape.calculateArea());
			break;
		}
		case 4: {
			if (shape == null) {
				break;
			}
			System.out.println("Perimeter of shape : " + shape.calculatePerimeter());
			break;
		}
		case 5: {
			if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				circle.draw();
			} else {
				System.out.println("Cannot draw Rectangle");
			}
			break;
		}
		default: {
			System.out.println("Invalid Input");
		}

		}
		}while(op!=0);

	}

}
