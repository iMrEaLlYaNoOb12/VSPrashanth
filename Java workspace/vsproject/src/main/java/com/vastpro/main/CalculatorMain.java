//CalculatorMain class to perform calculation
package com.vastpro.main;

import java.util.Scanner;

import com.vastpro.service.CalculatorService;

public class CalculatorMain {

	public static void main(String[] args) {
		// Creating object of CalculatorService to access the methods
		CalculatorService service = new CalculatorService();

		// Creating Scanner object to get input values from user
		Scanner scanner = new Scanner(System.in);

		// Getting input for first number
		System.out.println("Enter the first number/base number : ");
		int firstNumber = scanner.nextInt();
		// Getting input for Second number
		System.out.println("Enter the second number/power number : ");
		int secondNumber = scanner.nextInt();

		System.out.println("Do you want to : \n1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Power Result ");
		// Creating a integer variable for switch statement
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			// Result for adding two numbers
			int resultAdd = service.addTwoNumbers(firstNumber, secondNumber);
			System.out.println(resultAdd + " is the sum of both numbers.");
			break;
		case 2:
			// Result for Subtracting two numbers
			int resultSub = service.subtractTwoNumbers(firstNumber, secondNumber);
			System.out.println(resultSub + " is the difference of both numbers.");
			break;
		case 3:
			// Result for multiplying two numbers
			int resultMul = service.multiplyTwoNumbers(firstNumber, secondNumber);
			System.out.println(resultMul + " is the product of both numbers.");
			break;
		case 4:
			// Result for dividing two numbers
			int resultDiv = service.divideTwoNumbers(firstNumber, secondNumber);
			System.out.println(resultDiv + " is the quotient of both numbers.");
			break;
		case 5:
			// Result for getting the power result of a base number
			int resultPower = service.powerNumber(firstNumber, secondNumber);
			System.out.println(resultPower + " is the power result of the input.");
			break;
		default:
			System.out.println("Enter a valid choice.");
		}

		// Closing Scanner
		scanner.close();
	}
}
