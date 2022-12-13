package Item3;

public class Case extends NCOV{

	@Override
	public void computeRatio() {
		int infectee = infected;
		int pop = population;
		while(pop % infectee == 0) {
			
		}
		System.out.println(infectee + ":" + pop);
	}
	
}
