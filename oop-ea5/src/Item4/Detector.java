package Item4;

import java.util.Scanner;

public class Detector {
	Scanner input = new Scanner(System.in);
	public int getInput() {
		System.out.print("Enter a number: ");
		return input.nextInt();
	}
	
	public String validate(int num) {
		if (num < 0) {
			return "Negative";
		} else {
			return "Positive";
		}
	}
}
