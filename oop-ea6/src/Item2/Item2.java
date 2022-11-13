package Item2;

import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.print("Enter the student name: ");
		name = input.nextLine();
		System.out.print("Enter the student age: ");
		age = input.nextInt();
		
		Student studentA = new Student(name, age);
		
		System.out.println("Student Name: " + studentA.getName());
		System.out.println("Student Age: " + studentA.getAge());
	}

}
