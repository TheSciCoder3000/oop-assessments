import java.util.Scanner;

public class Item5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k;
		
		do {
			System.out.print("Enter K: ");
			k = input.nextInt();

			if (k > 9) {
				System.out.println("Please enter a value less than 10");
			}
		} while (k > 9);
		
		for (int r = 1; r <= k; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println("");
		}
		
	}

}
