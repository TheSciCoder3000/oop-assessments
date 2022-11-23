package Item3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Sales sale = new Sales();
		int price, discRate;
		
		System.out.print("Enter the price: ");
		price = input.nextInt();
		System.out.print("Enter the discount rate: ");
		discRate = input.nextInt();
		
		if (discRate <= 100) {
			sale.setSale(price, discRate);
			System.out.println("Discounted Price: " + sale.getPrice());
		} else {
			System.out.println("Error: You entered a discount rate greater than 100");
		}
		
	}
}
