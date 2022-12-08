package Item3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Child obj = new Child();
		
		System.out.print("Enter the private value: ");
		obj.setNum(input.nextInt());
		
		System.out.println("The private value is " + obj.getNum());
		
		input.close();
	}

}
