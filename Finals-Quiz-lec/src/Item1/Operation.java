package Item1;

public class Operation {
	private int num1;
	private int num2;
	
	Operation(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public void addition() {
		System.out.println("The sum is: " + (num1 + num2));
	}
}
