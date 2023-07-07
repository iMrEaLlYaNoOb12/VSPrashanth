package com.vastpro.basicclose.main;

import java.util.Scanner;

public class NumberLocationInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check the location in the array : ");
		int number = scanner.nextInt();
		int numbers[] = { 10, 20, 30, 40, 50, 10 };
		int flag = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				System.out.println(number + " is present in " + i + " index location in the array");
				flag++;
			}
		}
		if (flag == 0) {
			System.out.println("The number is not present in the array");

		}

		scanner.close();

	}

}
