package Item2;

public class Compute {
	private int pre, mid, fin, average;
	
	public void displayFinal(int _prelim, int _midterm, int _final) {
		pre = _prelim;
		mid = _midterm;
		fin = _final;
		average = computeGrade();
		
		if (testGrade()) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
	}
	
	protected boolean testGrade() {
		return average >= 75;
	}
	
	protected int computeGrade() {
		return (pre+mid+fin) / 3;
	}
}
