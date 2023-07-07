package com.vastpro.basicopen.main;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length and width of the rectangle...\n");
		System.out.println("Enter the length of the rectangle : ");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of the rectangle : ");
		double width = scanner.nextDouble();

		double areaOfRectangle = length * width;
		System.out.println("Area of rectangle is : " + areaOfRectangle);

		scanner.close();

	}

}
