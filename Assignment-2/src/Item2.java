import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double age;
		
		System.out.print("Please enter your age: ");
		age = input.nextDouble();
		
		if (age <= 17) {
			System.out.println("Minor");
		} else if (age >= 60) {
			System.out.println("Senior Citizen");
		} else {
			System.out.println("Legal");
		}
	}

}
