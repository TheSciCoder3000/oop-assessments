package Item3;

public class Largest {
	protected int X;
	
	public int Largest(int a, int b) {
		return Math.max(a, b);
	}
	public int Largest(int a, int b, int c) {
		return Math.max(c, Largest(a, b));
	}
	public int Largest(int a, int b, int c, int d) {
		return Math.max(d, Largest(a, b, c));
	}
}
