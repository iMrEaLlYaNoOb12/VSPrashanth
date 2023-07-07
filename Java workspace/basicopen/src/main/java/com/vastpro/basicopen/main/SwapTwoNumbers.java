package com.vastpro.basicopen.main;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;

		System.out.println("---Before Swapping---");
		System.out.println("Number 1 : " + number1);
		System.out.println("Number 2 : " + number2 + "\n");

		int temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("---After Swapping---");
		System.out.println("Number 1 : " + number1);
		System.out.println("Number 2 : " + number2);

	}

}
