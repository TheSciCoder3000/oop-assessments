package Item2;

import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		Compute grades = new Compute();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Prelim grade: ");
		int prelim = input.nextInt();
		System.out.print("Enter your Midterm grade: ");
		int midterm = input.nextInt();
		System.out.print("Enter your Final grade: ");
		int fin = input.nextInt();
		
		grades.displayFinal(prelim, midterm, fin);
	}

}
