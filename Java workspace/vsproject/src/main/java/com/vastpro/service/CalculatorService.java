//Logics for Calculator
package com.vastpro.service;

public class CalculatorService {
	//Method to add two numbers
	public int addTwoNumbers(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum;

	}
	
	//Method to subtract two numbers
	public int subtractTwoNumbers(int firstNumber, int secondNumber) {
		int difference = firstNumber - secondNumber;
		return difference;

	}
	
	//Method to multiply two numbers
	public int multiplyTwoNumbers(int firstNumber, int secondNumber) {
		int product = firstNumber * secondNumber;
		return product;

	}
	
	//Method to divide two numbers
	public int divideTwoNumbers(int firstNumber, int secondNumber) {
		int quotient = firstNumber / secondNumber;
		return quotient;

	}
	
	//Method to get the power result of a number
	public int powerNumber(int baseNumber, int powerNumber) {
		int temp = baseNumber;
		for (int i = 1; i < powerNumber; i++) {
			temp = temp * baseNumber;
		}
		return temp;

	}

}
