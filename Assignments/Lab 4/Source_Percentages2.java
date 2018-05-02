//Colton Leach COSC 1337.702 Lab #4
import java.util.Scanner;

public class Percentages2 {
	public static void main (String args[]) {
		
		double a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = input.nextDouble();
		System.out.println("Enter a second number: ");
		b = input.nextDouble();
		
		computePercent(a, b);
	}
	public static void computePercent(double a, double b) {
		double c, d;
		c = a/b;
		c = c*100;
		d = b/a;
		d = d*100;
		System.out.println(a + " is " + c + " percent of " + b);
		System.out.println(b + " is " + d + " percent of " + a);
	}
}