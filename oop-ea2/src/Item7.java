import java.util.Scanner;

public class Item7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Enter value of num1: ");
		num1 = input.nextInt();
		System.out.print("Enter value of num2: ");
		num2 = input.nextInt();
		System.out.print("Enter value of num3: ");
		num3 = input.nextInt();
		
		if (num1 == num2) {
			if (num1 == num3) {
				System.out.println("All numbers are equal");				
			} else {
				System.out.println(num3 + " is the only unique number");
			}
		} else if (num1 == num3) {
			System.out.println(num2 + " is the only unique number");
		} else if (num3 == num2) {
			System.out.println(num1 + " is the only unique number");
		} else {
			System.out.println(Math.max(num1, Math.max(num2, num3)) + " is the largest number among the three");
		}
	}

}
