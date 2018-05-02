//Colton Leach COSC 1337.702 Lab #9
import java.util.Scanner;

public class Schedule{
	public static void main(String[] args){
		String[][] classSchedule = { {"BIOL 1307", "Monday/Wednesday",  "10:10am - 1:10pm"},
                                   {"MATH 2413", "Tuesday/Thursday",   "10:10am - 11:45am"},
                                   {"ENGL 1301", "Monday/Wednesday", "8:45am - 10:00am"},
                                   {"COSC 1336", "Wednesday",   "1:30pm - 3:10pm"} };

		String course;
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter a course name: ");
		course = input.nextLine();
		
		//Added Ignore Case so the user doesn't have to worry about case sensitivity.
		if(course.equalsIgnoreCase("BIOL 1307"))
			System.out.println(classSchedule[0][0] + " meets at " + classSchedule[0][2] + " on " + classSchedule[0][1]);
		else if (course.equalsIgnoreCase("MATH 2413"))
			System.out.println(classSchedule[1][0] + " meets at " + classSchedule[1][2] + " on " + classSchedule[1][1]);
		else if (course.equalsIgnoreCase("ENGL 1301"))
			System.out.println(classSchedule[2][0] + " meets at " + classSchedule[2][2] + " on " + classSchedule[2][1]);
		else if (course.equalsIgnoreCase("COSC 1336"))
			System.out.println(classSchedule[3][0] + " meets at " + classSchedule[3][2] + " on " + classSchedule[3][1]);
		else
			System.out.println("Invalid course.");
	}
}