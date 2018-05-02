//Colton Leach COSC 1337.702 Lab #4
import java.util.Scanner;

public class NumbersDemo2 {
	public static void main (String args[]) {
		
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		num1 = input.nextInt();
		System.out.println("Enter your second number: ");
		num2 = input.nextInt();
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2);
	}
	public static void displayTwiceTheNumber(int a, int b) {
		System.out.println("First number multiplied by 2: " + a*2);
		System.out.println("Second number multiplied by 2: " + b*2);
	}
	public static void displayNumberPlusFive(int a, int b) {
		System.out.print("First number plus 5: ");
		System.out.println(a+5);
		System.out.print("Second number plus 5: ");
		System.out.println(b+5);
	}
	public static void displayNumberSquared(int a, int b) {
		System.out.println("First number squared: " + a*a);
		System.out.println("Second number squared: " + b*b);
	}
	
}
