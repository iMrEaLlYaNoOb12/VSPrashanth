package com.vastpro.basicopen.main;

public class SumOfArrayValues {

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 50, 10 };
		int sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		System.out.println("The sum of numbers in the array is : " + sum);

	}

}
