package Item3;

public class Testers {
	private int[] voltArray = new int[10];
	private int voltActive, voltSaturated, voltCutoff;

	public void setValue(int[] setArray) {
		voltArray = setArray;
	}
	
	public int[] getValue() {
		return voltArray;
	}
	
	public void setValue(int setActive, int setSaturated, int setCutoff) {
		voltActive = setActive;
		voltSaturated = setSaturated;
		voltCutoff = setCutoff;
	}
	
	public void displayResult() {
		System.out.println("\nDisplaying Results:");
		System.out.println("No. of Active: " + voltActive);
		System.out.println("No. of Saturated: " + voltSaturated);
		System.out.println("No. of Cutoff: " + voltCutoff);
	}
	
	
}
