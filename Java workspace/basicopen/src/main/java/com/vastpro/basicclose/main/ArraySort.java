package com.vastpro.basicclose.main;

import java.util.Scanner;

import com.vastpro.basicclose.service.BasicCloseService;

public class ArraySort {

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
		System.out.println("Do you want to print the numbers in : \n1) Ascending order\n2) Descending order");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			int resultAscending[] = service.sortAscendingOrder(numbers);
			for (int i : resultAscending) {
				System.out.println(i);
			}
			break;
		case 2:
			int resultDescending[] = service.sortDescendingOrder(numbers);
			for (int i : resultDescending) {
				System.out.println(i);
			}
			break;
		default:
			System.out.println("Invalid Choice");
		}
		scanner.close();
	}

}
