package item1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Group 1");
		Department grp1 = new Department();
		System.out.println("\nGroup 2");
		Department grp2 = new Department();
		
		System.out.println("\n\nGroup 1 Average: " + grp1.getGroupAverage());
		System.out.println("Group 2 Average: " + grp2.getGroupAverage());
		System.out.print("Higest Rating: ");
		if (grp1.getGroupAverage() > grp2.getGroupAverage()) {
			System.out.println("Group 1 = " + grp1.getGroupAverage());
		} else {
			System.out.println("Group 2 = " + grp2.getGroupAverage());
		}
		Department.displayAverage();
	}

}
