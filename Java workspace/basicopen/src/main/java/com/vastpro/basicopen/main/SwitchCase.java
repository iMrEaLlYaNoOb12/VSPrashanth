package com.vastpro.basicopen.main;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Choose your option : ");
		System.out.println("1) To print java.. \n2) To print ES6");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println("ES6");
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();

	}

}
