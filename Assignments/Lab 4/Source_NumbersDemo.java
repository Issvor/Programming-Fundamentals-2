//Colton Leach COSC 1337.702 Lab #4

public class NumbersDemo {
	public static void main (String args[]) {
		System.out.println("First number is 15, second number is 6.");
		displayTwiceTheNumber(15, 6);
		displayNumberPlusFive(15, 6);
		displayNumberSquared(15, 6);
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
