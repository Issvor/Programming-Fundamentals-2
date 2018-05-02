//Colton Leach COSC 1337.702 Lab #5

import java.util.Scanner;

public class TestBloodData {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BloodData user = new BloodData();
		System.out.print("What is your Blood type (O, A, B, or AB)? ");
		user.setBloodType(input.next());
		System.out.print("\nWhat is your rhFactor (+ or -)? ");
		user.setRhFactor(input.next());
		System.out.println("Blood type of user: " + user.getBloodType() + user.getRhFactor());
		blood();
	}
	public static void blood() {
		BloodData patient1 = new BloodData();
		BloodData patient2 = new BloodData("AB", "-");
		System.out.println("Blood type of constructor: " + patient1.getBloodType() + patient1.getRhFactor());
		System.out.println("Blood type of overloaded constructor: " + patient2.getBloodType() + patient2.getRhFactor());
	}
}
