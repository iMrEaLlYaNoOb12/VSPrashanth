package com.vastpro.basicclose.service;

public class BasicCloseService {
	public int calculateAverage(int numbers[]) {
		int sum = 0;
		for (int i : numbers) {
			sum = sum + i;
		}
		int average = sum / numbers.length;
		return average;

	}

	public int[] sortAscendingOrder(int numbers[]) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;

	}

	public int[] sortDescendingOrder(int numbers[]) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;

	}

}
