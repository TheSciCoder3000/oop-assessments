import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Enter value of num1: ");
		num1 = input.nextInt();
		System.out.print("Enter value of num2: ");
		num2 = input.nextInt();
		System.out.print("Enter value of num3: ");
		num3 = input.nextInt();
		
		if (num1 != num2 && num1 != num3 && num2 != num3) {
			System.out.println("Unique Numbers");
		} else {
			System.out.println("Not Unique Numbers");
		}
	}

}
