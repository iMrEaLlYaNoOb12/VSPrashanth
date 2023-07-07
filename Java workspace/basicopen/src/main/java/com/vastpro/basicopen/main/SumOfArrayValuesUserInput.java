package com.vastpro.basicopen.main;

import java.util.Scanner;

public class SumOfArrayValuesUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size for the array");
		int size = scanner.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		System.out.println("The sum of numbers in the array is : " + sum);
		scanner.close();
	}

}
