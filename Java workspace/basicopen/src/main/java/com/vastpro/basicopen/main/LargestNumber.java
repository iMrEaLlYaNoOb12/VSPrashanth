package com.vastpro.basicopen.main;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers to find the largest of them....\n");
		System.out.println("Enter the first number : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int thirdNumber = scanner.nextInt();

		System.out.println();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " is the largest number");
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println(secondNumber + " is the largest number");
		} else {
			System.out.println(thirdNumber + " is the largest number");
		}

		scanner.close();
	}

}
