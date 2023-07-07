package com.vastpro.basicopen.main;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers to multiply...");
		System.out.println("Enter the first number : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int secondNumber = scanner.nextInt();

		int multiply = firstNumber * secondNumber;
		System.out.println("Multiplication of both numbers is : " + multiply);
		scanner.close();
	}

}
