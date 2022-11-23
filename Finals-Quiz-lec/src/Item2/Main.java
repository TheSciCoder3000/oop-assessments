package Item2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter num 1: ");
		num1 = input.nextInt();
		System.out.print("Enter num 2: ");
		num2 = input.nextInt();
		
		Operation oper = new Operation(num1, num2);
		
		System.out.println("The sum is: " + oper.addition());

	}

}
