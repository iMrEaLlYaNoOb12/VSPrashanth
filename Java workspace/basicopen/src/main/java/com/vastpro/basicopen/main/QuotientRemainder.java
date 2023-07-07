package com.vastpro.basicopen.main;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers for dividend and divisor :");
		System.out.println("Enter dividend : ");
		int dividend = scanner.nextInt();
		System.out.println("Enter Divisor : ");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("The quotient of both numbers is " + quotient);
		System.out.println("The remainder of both numbers is " + remainder);

		scanner.close();

	}

}
