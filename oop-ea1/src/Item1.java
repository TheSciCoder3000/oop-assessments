import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		// initialize variables
		String student_name;
		String course_name;
		int student_number;
		Scanner input = new Scanner(System.in);
		
		// get user input
		System.out.print("Enter your name: ");
		student_name = input.nextLine();
		System.out.print("Enter your Student Number: ");
		student_number = input.nextInt();
		input.nextLine();
		System.out.print("Enter your Course name: ");
		course_name = input.nextLine();
		
		// display information
		System.out.println("\nStudent Name: " + student_name);
		System.out.println("Student Number: " + student_number);
		System.out.println("Course Name: " + course_name);
	}

}
