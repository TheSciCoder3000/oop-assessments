package Item5;

import java.util.Scanner;

public class Student {
	protected String name;
	protected int age;
	protected float GPA;
	Scanner input = new Scanner(System.in);
	
	public void inputDetails() {
		System.out.print("Enter student name: ");
		name = input.nextLine();
		System.out.print("Enter student age: ");
		age = input.nextInt();
		System.out.print("Enter student GPA: ");
		GPA = input.nextFloat();
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getGPA() {
		return GPA;
	}
}
