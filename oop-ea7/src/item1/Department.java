package item1;

import java.util.Scanner;

public class Department {
	private int groupScore = 0;
	private double groupAverage;
	private static int overallScore;
	private static double overallAverage;

	Department() {
		Scanner input = new Scanner(System.in);
		
		// Get scores from evaluators
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter score of evaluator " + (i+1) + ": ");
			groupScore += input.nextInt();
		}
		
		// compute average
		groupAverage = groupScore / 5.0;
		
		// add group score to overall score
		overallScore += groupScore;
	}
	
	public double getGroupAverage() {
		return groupAverage;
	}
	
	public static void displayAverage() {
		overallAverage = overallScore / 10.0;
		System.out.println("Overall Average: " + overallAverage);
	}
}
