package Item5;

public class Main {

	public static void main(String[] args) {
		Male Tony = new Male();
		Female Jennifer = new Female();
		
		Tony.setData("Tony Stark", "CEO", 1000000, 40);
		Jennifer.setData("Jennifer Lorenz", "Secretary", 100000, 25);
		
		System.out.println(Tony.getDetails());
		System.out.println();
		System.out.println(Jennifer.getDetails());
	}

}
