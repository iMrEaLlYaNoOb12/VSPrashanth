package com.vastpro.basicopen.main;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers...\n");
		System.out.println("Enter the first number : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int secondNumber = scanner.nextInt();
		
		int sumOfNumbers = firstNumber + secondNumber;
		
		System.out.println("\nThe Sum of " + firstNumber + " and " + secondNumber + " is " + sumOfNumbers);
		scanner.close();
	}

}
