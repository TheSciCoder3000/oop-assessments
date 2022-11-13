package Item2;

public class Student {
	private String stdName;
	private int stdAge;
	
	Student(String set_name, int set_age) {
		stdName = set_name;
		stdAge = set_age;
	}
	
	public String getName() {
		return stdName;
	}
	
	public int getAge() {
		return stdAge;
	}
}
