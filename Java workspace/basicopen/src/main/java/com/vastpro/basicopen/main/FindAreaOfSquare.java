package com.vastpro.basicopen.main;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side to find the area of square : ");
		double side = scanner.nextDouble();
		double areaOfSquare = side * side;
		System.out.println("Area of square is : " + areaOfSquare);
		scanner.close();
	}

}
