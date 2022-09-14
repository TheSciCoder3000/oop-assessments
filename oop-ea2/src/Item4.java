import java.util.Scanner;

public class Item4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double monthly_rate, andrew, andrei, andres;
		
		System.out.print("Enter the monthly rate: ");
		monthly_rate = input.nextDouble();
		
		andrew = monthly_rate * 0.4;
		andrei = monthly_rate * 0.35;
		andres = monthly_rate * 0.25;
		
		System.out.println("\nMonthly Contribution:");
		System.out.println("Andrew: " + andrew);
		System.out.println("Andrei: " + andrei);
		System.out.println("Andres: " + andres);
		System.out.println("TOTAL: " + (andrew + andrei + andres));
		System.out.println("\nTotal Rent for School Year (10 months): " + (monthly_rate*10));
		System.out.println("\nSchool Year Rent Summary");
		System.out.println("Andrew: " + andrew*10);
		System.out.println("Andrei: " + andrei*10);
		System.out.println("Andres: " + andres*10);
	}

}
