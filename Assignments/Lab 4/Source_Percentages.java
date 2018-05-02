//Colton Leach COSC 1337.702 Lab #4

public class Percentages {
	public static void main (String args[]) {
		System.out.println("The first number is 2, the second is 5.");
		computePercent(2, 5);
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