//Colton Leach COSC 1337.702 Lab #3

import java.util.Scanner;

public class ArithmeticDemo2 {
	public static void main(String args[]) {
		double firstNumber, secondNumber, sum, difference, average;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a double: ");
		firstNumber = input.nextDouble();
		System.out.print("Enter a second double: ");
		secondNumber = input.nextDouble();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;

		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println(firstNumber + " and " + secondNumber + " is " + average);
	}
}
