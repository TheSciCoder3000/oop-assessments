package Item5;

public class Employee {
	private String name;
	private String position;
	private double salary;
	private int years;
	
	public void setData(String set_name, String set_pos, double set_salary, int set_years) {
		name = set_name;
		position = set_pos;
		salary = set_salary;
		years = set_years;
	}
	
	public String getDetails() {
		return ("Name: " + name + "\nPosition: " + position + "\nSalary: " + salary + "\nYears: " + years);
	}
}
