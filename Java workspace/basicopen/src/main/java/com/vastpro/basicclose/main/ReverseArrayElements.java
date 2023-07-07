package com.vastpro.basicclose.main;

public class ReverseArrayElements {
	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 50, 10 };
		System.out.println("---Array before reversing---");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---Array after reversing---");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}

}
