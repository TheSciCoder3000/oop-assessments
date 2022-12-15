package Item3;

public abstract class NCOV {
	public String Country;
	public int population;
	public int infected;
	public int recovered;
	public String ratioOfInfected;
	
	public abstract void computeRatio();
	
	public void setCountry(String name) {
		Country = name;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setPopulation(int pop) {
		population = pop;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setRecovered(int rec) {
		recovered = rec;
	}
	
	public int getRecovered() {
		return recovered;
	}
	
	public void setInfected(int inf) {
		infected = inf;
	}
	
	public int getInfected() {
		return infected;
	}
	
	
}
