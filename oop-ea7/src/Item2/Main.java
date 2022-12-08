package Item2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Group 1:");
		Sales grp1 = new Sales();
		System.out.println("\nGroup 2:");
		Sales grp2 = new Sales();

		System.out.println("Total Sales of Group 1: " + grp1.getTotalSales());
		System.out.println("Total Sales of Group 2: " + grp2.getTotalSales());
		
		Sales.displayTotalGroupSales();
	}

}
