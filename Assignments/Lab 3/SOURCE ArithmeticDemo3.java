//Colton Leach COSC 1337.702 Lab #3

import java.util.Scanner;

public class ArithmeticDemo3 {
	public static void main(String args[]) {
		int firstNumber, secondNumber, sum, difference;
		double average;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		firstNumber = input.nextInt();
		System.out.print("Enter a second integer: ");
		secondNumber = input.nextInt();
		
		sum = (firstNumber + secondNumber);
		difference = (firstNumber - secondNumber);
		average = (sum / 2.0);

		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println(firstNumber + " and " + secondNumber + " is " + average);
	}
}
