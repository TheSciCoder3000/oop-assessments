
public class Operation {
	protected int a;
	protected int b;
	protected int large;
	protected int sum;
	
	public void setNumber(int set_a, int set_b) {
		a = set_a;
		b = set_b;
	}
	
	public void add() {
		sum = a+b;
		System.out.println("The sum is: " + sum);
	}
	
	public void large() {
		large = Math.max(a, b);
		System.out.println("The largest is: " + large);
	}
}
