import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean again = true;
		char again_res;
		
		while (again) {
			double even_sum = 0, odd_sum = 0, num_even = 0, num_odd = 0, num_input;
			System.out.print("Enter any number: ");
			num_input = input.nextDouble();
			
			for (int x = 1; x <= num_input; x++) {
				if (x % 2 != 0) {
					System.out.println("The Odd number is: " + x);
					odd_sum += x;
					num_odd++;
				}
			}
			System.out.println("The Average is: " + (odd_sum/num_odd));
			
			for (int x = 1; x <= num_input; x++) {
				if (x % 2 == 0) {
					System.out.println("The Even number is: " + x);
					even_sum += x;
					num_even++;
				}
			}
			System.out.println("The Average is: " + (even_sum/num_even));
			System.out.print("Try Again [Yy/Nn]: ");
			input.nextLine();
			again_res = input.nextLine().charAt(0);
			again = again_res == 'N' || again_res == 'n' ? false : true;
		}
	}

}
