package Item1;

import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student studentA = new Student();
		
		System.out.print("Enter the student name: ");
		studentA.setName(input.nextLine());
		System.out.print("Enter the student age: ");
		studentA.setAge(input.nextInt());
		
		System.out.println("Student Name: " + studentA.getName());
		System.out.println("Student Age: " + studentA.getAge());
	}

}
