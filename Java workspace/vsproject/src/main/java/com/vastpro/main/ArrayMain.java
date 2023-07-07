//ArrayMain programs 
package com.vastpro.main;

import java.util.List;
import java.util.Scanner;

import com.vastpro.service.ArrayService;

public class ArrayMain {

	public static void main(String[] args) {
		// Creating object of ArrayService to access objects
		ArrayService service = new ArrayService();

		// Creating Scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Display message for user to do which operation.
		System.out.println(
				"Do you want to :\n1) Display array\n2) Sum of Array\n3) Average of Array\n4) Maximum and Minimum\n5) Sort Array\n6) Search Array\n7) Modify Array");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			// To Display Array
			int[] displayArray = service.displayArray(numbers);
			for (int i : displayArray) {
				System.out.println(i);
			}
			break;
		case 2:
			// To Display the sum of numbers in the array
			int resultSumOfArray = service.sumOfArray(numbers);
			System.out.println(resultSumOfArray + " is the sum of array");
			break;
		case 3:
			// To Display the average of numbers in the array
			int resultAverageArray = service.averageOfArray(numbers);
			System.out.println(resultAverageArray + " is the average of the array.");
			break;
		case 4:
			// To Display the maximum and minimum value in the array
			String resultMinAndMaxArray = service.findMinAndMaxInArray(numbers);
			System.out.println(resultMinAndMaxArray);
			break;
		case 5:
			// To Sort and Array
			int resultSortArray[] = service.sortArray(numbers);
			for (int i : resultSortArray) {
				System.out.println(i);
			}
			break;
		case 6:
			// To Search a number in the array
			System.out.println("Number to search in the array : ");
			int numberToSearch = scanner.nextInt();
			List<String> resultSearchArray = service.searchArray(numbers, numberToSearch);
			for (String string : resultSearchArray) {
				if (string != null) {
					System.out.println(string);

				} else {

					System.out.println("Number is not present in the array");
				}
			}
			break;
		case 7:
			// To change an value of an index position
			System.out.println("Index value starts from 0 to " + (numbers.length - 1));
			System.out.println("Enter the index Value :");
			int indexValue = scanner.nextInt();
			System.out.println("Enter the value to change : ");
			int valueToChange = scanner.nextInt();
			int resultArrayModify[] = service.modifyArray(numbers, indexValue, valueToChange);
			for (int i : resultArrayModify) {
				System.out.println(i);
			}

			break;
		default:
			System.out.println("Enter a correct choice.");
		}

		scanner.close();
	}

}
