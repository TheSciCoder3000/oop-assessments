package Item2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Derived derived = new Derived();
		int a, b;
		
		System.out.print("Enter value of a: ");
		a = input.nextInt();
		System.out.print("Enter value of b: ");
		b = input.nextInt();
		
		System.out.println("A is " + (a > 0 ? "Positive" : "Negative"));
		System.out.println((a > 0 ? "A^2: " : "A^3: ") + derived.SquareCube(a));
		System.out.println("B is " + (b > 0 ? "Positive" : "Negative"));
		System.out.println((b > 0 ? "B^2: " : "B^3: ") + derived.SquareCube(b));
		
		System.out.println("Sum: " + derived.sum(a, b));
		System.out.println("Diff: " + derived.diff(a, b));
		System.out.println("Product: " + derived.product(a, b));
		System.out.println("Quotient: " + derived.quotient(a, b));
		
		input.close();
	}

}
