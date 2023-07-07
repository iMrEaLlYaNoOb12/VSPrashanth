package com.vastpro.basicopen.main;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius to find the area and circumference of the circle : \n");
		System.out.println("Enter radius : ");
		double radius = scanner.nextDouble();
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * 2 * radius;
		System.out.println("The area of the circle is : " + area);
		System.out.println("The circumference of the circle is :  " + circumference);
		scanner.close();

	}

}
