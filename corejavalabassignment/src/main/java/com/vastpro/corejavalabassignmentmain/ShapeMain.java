package com.vastpro.corejavalabassignmentmain;

import java.util.Scanner;

import com.vastpro.corejavalabassignmentservice.CircleImpl;
import com.vastpro.corejavalabassignmentservice.RectangleImpl;
import com.vastpro.corejavalabassignmentservice.Shape;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape rectangle = new RectangleImpl();
		Shape circle = new CircleImpl();

		System.out.println("Which Shape's area do you want to calculate ? : ");
		System.out.println("1) Rectangle\n2) Circle");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter the length of the rectangle : ");
			double length = scanner.nextDouble();
			System.out.println("Enter the width of the rectangle : ");
			double width = scanner.nextDouble();
			double areaRect = rectangle.calculateArea(length, width);
			System.out.println("Area of rectangle is : " + areaRect);
			break;
		case 2:
			System.out.println("Enter the radius of the circe : ");
			double radius = scanner.nextDouble();
			double areaCircle = circle.calculateArea(radius, radius);
			System.out.println("Area of the circle is : " + areaCircle);
			break;
		default:
			System.out.println("Invalid Choice...");
		}
		scanner.close();
	}

}
