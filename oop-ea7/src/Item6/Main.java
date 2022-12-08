package Item6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle rect = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the width of square: ");
		int s = input.nextInt();
		sq.setValues(s, s);
		
		System.out.print("Enter the width of rectangle: ");
		int w = input.nextInt();
		System.out.print("Enter the length of rectangle: ");
		int l = input.nextInt();
		rect.setValues(l, w);
		
		System.out.println("Perimeter of Square: ");
		sq.compute();
		
		System.out.println("Perimeter of Rectangle:");
		rect.compute();
		
		input.close();
	}

}
