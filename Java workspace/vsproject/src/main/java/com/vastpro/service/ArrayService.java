//Logics for Arrays
package com.vastpro.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayService {

	// Method to Display the numbers in the array
	public int[] displayArray(int numbers[]) {
		return numbers;

	}

	// Method to display the sum of the array
	public int sumOfArray(int numbers[]) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			temp = temp + numbers[i];
		}
		return temp;

	}

	// Method to display the average of the array
	public int averageOfArray(int numbers[]) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			temp = temp + numbers[i];
		}
		int average = temp / numbers.length;
		return average;

	}

	// Method to display the mininum and maximum value in an array
	public String findMinAndMaxInArray(int numbers[]) {
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
		String resultMinAndMax = numbers[0] + " is the minimum value in the array and " + numbers[numbers.length - 1]
				+ " is the maximum value in the array";
		return resultMinAndMax;

	}

	// Method to sort an array
	public int[] sortArray(int numbers[]) {
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

	// Method to search an element in the array
	public List<String> searchArray(int numbers[], int numberToSearch) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numberToSearch) {
				result.add(numberToSearch + " is present in the index value = " + i);
			}

		}

		return result;

	}
	
	//Method to modify an element in the array
	public int[] modifyArray(int numbers[], int indexValue, int valueToChange) {
		numbers[indexValue] = valueToChange;
		return numbers;
		
	}
}
