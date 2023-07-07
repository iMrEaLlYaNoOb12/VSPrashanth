package com.vastpro.basicopen.main;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();

		System.out.println("The number you entered is " + number);
		scanner.close();

	}

}
