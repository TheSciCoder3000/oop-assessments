import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		// initialize variables
		Scanner input = new Scanner(System.in);
		double item_1, item_2, item_3, change, net_total, total, vat, senior_discount, payment;
		boolean isSenior = false, payment_suff;
		
		// get user input
		System.out.print("Enter the price of item 1: ");
		item_1 = input.nextDouble();
		System.out.print("Enter the price of item 2: ");
		item_2 = input.nextDouble();
		System.out.print("Enter the price of item 3: ");
		item_3 = input.nextDouble();
		
		String senior_res = "";
		input.nextLine();
		while (!(senior_res.equals("Yes") || senior_res.equals("No"))) {
			System.out.print("Are you a Senior citizen [Yes / No]: ");
			senior_res = input.nextLine();
			isSenior = senior_res.equals("Yes") ? true : false;
		}
		
		System.out.print("Enter your payment amount: ");
		payment = input.nextDouble();
		
		// calculations
		net_total = item_1 + item_2 + item_3;
		vat = net_total * 0.1;
		senior_discount = isSenior ? net_total * 0.2 : 0;
		total = net_total + vat - senior_discount;
		change = payment - total;
		
		// print receipt
		System.out.println("\nTotal Amount: " + total);
		if (change >= 0) {
			System.out.println("Payment Complete!\nYour change is: " + change);			
		} else {
			System.out.println("Payment Error: payment amount is insufficient");
		}
		
		
	}

}
