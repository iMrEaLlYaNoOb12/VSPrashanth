package com.vastpro.basicopen.main;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char character = scanner.next().charAt(0);
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println(character + " is a vowel.");
		} else {
			System.out.println(character + " is a consonant.");
		}
		scanner.close();
	}

}
