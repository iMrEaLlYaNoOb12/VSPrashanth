package com.vastpro.corejavalabassignmentmain;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.vastpro.corejavalabassignmentservice.ExceptionHandlingService;

public class ExceptionHandleMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		ExceptionHandlingService service = new ExceptionHandlingService();
		try {

			System.out.println("Enter two numbers : ");
			System.out.println("Enter number1 : ");
			int number1 = scanner.nextInt();
			System.out.println("Enter number2 : ");
			int number2 = scanner.nextInt();
			int resultDivide = service.toDivide(number1, number2);
			System.out.println("Quotient of both the numbers is : " + resultDivide);
		} catch (ArithmeticException ae) {
			System.err.println("The number is " + ae.getMessage());
		} catch (InputMismatchException ime) {
			System.err.println("Invalid input. Enter a number.....");
		} finally {

			scanner.close();
		}
	}

}
