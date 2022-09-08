import java.util.Scanner;

public class Item3 {

	public static void main(String[] args) {
		// initialize variables
		Scanner input = new Scanner(System.in);
		double num1, num2, result = 0;
		char oper;
		boolean error = false;
		
		// get user input
		System.out.print("Enter the value of the 1st num: ");
		num1 = input.nextDouble();
		System.out.print("Enter the value of the 2nd num: ");
		num2 = input.nextDouble();
		input.nextLine();
		System.out.println("+ Addittion\t\t- Subtraction\n* Multiplication\t/ Division");
		System.out.print("Enter the operation used: ");
		oper = input.nextLine().charAt(0);
		
		switch (oper) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				error = true;
		}

		// print result
		System.out.println("");
		if (error) {
			System.out.println("Error: wrong operation character input");			
		} else {
			System.out.println("Result: " + result);
		}
	}

}
