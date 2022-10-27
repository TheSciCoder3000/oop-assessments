package Item5;

public class Item5 {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.inputDetails();
		System.out.println("\nStudent Name: " + stud1.getName());
		System.out.println("Student Age: " + stud1.getAge());
		System.out.println("Student GPA: " + stud1.getGPA());
	}

}
