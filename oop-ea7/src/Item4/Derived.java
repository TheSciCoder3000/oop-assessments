package Item4;

public class Derived extends Base{
	public void display() {
		System.out.println("The sum is: " + (getA() + getB()));
		System.out.println("The product is: " + (getA()*getB()));
	}
}
