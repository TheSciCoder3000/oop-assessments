import java.util.Scanner;

public class Item5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVE");
		} else if (num > 0) {
			System.out.println("POSITIVE");
		} else {
			System.out.println("ZERO");
		}
	}

}
