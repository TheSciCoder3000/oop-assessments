import java.util.Scanner;

public class Item5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		
		System.out.print("Enter number a: ");
		a = input.nextInt();
		System.out.print("Enter number b: ");
		b = input.nextInt();
		
		System.out.println("\nThe sum is: " + sum(a, b));
		System.out.println("The difference is: " + diff(a, b));
		System.out.println("The product is: " + prod(a, b));
		System.out.println("The quotient is: " + quot(a, b));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int diff(int a, int b) {
		return a - b;
	}
	
	public static int prod(int a, int b) {
		return a * b;
	}
	
	public static int quot(int a, int b) {
		return a / b;
	}

}
