package Item3;

import java.util.Scanner;

public class Item3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Testers tester = new Testers();
		int[] temp_volts = new int[10];
		
		// ====================================================================
		for (int i = 0; i < temp_volts.length; i++) {
			System.out.print("Enter volt " + (i+1) + ": ");
			temp_volts[i] = input.nextInt();
		}
		tester.setValue(temp_volts);
		
		// ====================================================================
		int active = 0, saturated = 0, cutoff = 0;
		for (int i = 0; i < tester.getValue().length; i++) {
			if (tester.getValue()[i] == 5) {
				active++;
			} else if (tester.getValue()[i] < 5) {
				cutoff++;
			} else {
				saturated++;
			}
		}
		
		tester.setValue(active, saturated, cutoff);
		tester.displayResult();
	}

}
