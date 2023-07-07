package com.vastpro.basicopen.main;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter any integer Value below 10: ");
		int number = scanner.nextInt();
		int sum = 0;
		while (number <= 10) {
			sum = sum + number;
			number++;
		}
		System.out.format("Sum of the Numbers From the While Loop is: %d ", sum);
		scanner.close();
	}

}
