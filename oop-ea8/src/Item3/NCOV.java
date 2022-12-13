package Item3;

public abstract class NCOV {
	public String Country;
	public int population;
	public int infected;
	public int recovered;
	public String ratioOfInfected;
	
	public abstract void computeRatio();
}
