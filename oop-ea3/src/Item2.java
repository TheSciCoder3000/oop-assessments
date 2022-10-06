import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		/**
		 * This program will continually ask the user to input an integer, num
		 * and will print n for n times in a single line such that n starts at 0
		 * and creates a new line for every increment of n
		 * 
		 * The program will terminate once the user inputs a negative number
		 */
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("Enter a number: ");
			num = input.nextInt();
			
			if (num < 0) {
				break;
			}
			
			for (int r = 1; r <= num; r++) {
				if (r % 2 != 0) {
					continue;
				}
				for (int c = 1; c <= r; c++) {
					System.out.print(r);
				}
				System.out.println("");
			}
			
		} while (true);
		
	}

}
