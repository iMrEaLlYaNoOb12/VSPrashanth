package com.vastpro.basicopen.main;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		System.out.println("Select a course : ");
		System.out.println("1) Python\n2) Java");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You have enrolled for python course...");
			break;
		case 2:
			System.out.println("Do you want to choose : \n1) Advanced Java\n2) J2EE");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("You have enrolled for Advanced java course...");
				break;
			case 2:
				System.out.println("You have enrolled for J2EE course...");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			break;
		default:
			System.out.println("Invalid Choice");

		}

		scanner.close();

	}

}
