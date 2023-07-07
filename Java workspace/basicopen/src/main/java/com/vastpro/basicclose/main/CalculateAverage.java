package com.vastpro.basicclose.main;

import java.util.Scanner;

import com.vastpro.basicclose.service.BasicCloseService;

public class CalculateAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size for the array");
		int size = scanner.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		BasicCloseService service = new BasicCloseService();

		int resultAverage = service.calculateAverage(numbers);
		System.out.println("The average of numbers in the array is : " + resultAverage);

		scanner.close();

	}

}
