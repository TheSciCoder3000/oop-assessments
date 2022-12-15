package Item3;

public class Case extends NCOV{

	@Override
	public void computeRatio() {
		int gcd = GCD(infected, population);
		ratioOfInfected = (infected / gcd) + ":" + (population / gcd);
	}
	
	int GCD(int a, int b) {
		return b == 0 ? a : GCD(b, a % b);
	}
	
}
