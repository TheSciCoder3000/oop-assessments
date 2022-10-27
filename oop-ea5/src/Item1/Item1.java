package Item1;

import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		CountMe count = new CountMe();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of X: ");
		int x = input.nextInt();
		System.out.print("Enter the value of LEFT: ");
		int LEFT = input.nextInt();
		System.out.print("Enter the value of RIGHT: ");
		int RIGHT = input.nextInt();
		
		count.displayCount(count.setValues(x, LEFT, RIGHT));
	}

}
