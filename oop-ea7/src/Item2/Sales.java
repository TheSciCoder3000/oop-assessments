package Item2;

import java.util.Scanner;

public class Sales {
	private int firstHalf, secondHalf, totalSales;
	private static int totalGroupSales;
	
	Sales() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sales in the first half: ");
		firstHalf = input.nextInt();
		System.out.print("Enter the sales in the second half: ");
		secondHalf = input.nextInt();
		
		computeTotalSales();
		totalGroupSales += totalSales;
	}
	
	public void computeTotalSales() {
		totalSales = firstHalf + secondHalf;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
	
	public static void displayTotalGroupSales() {
		System.out.println("Total group sales: " + totalGroupSales);
	}
	
}
