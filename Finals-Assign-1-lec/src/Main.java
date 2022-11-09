
public class Main {

	public static void main(String[] args) {
		Operation exp1 = new Operation();
		Operation exp2 = new Operation();

		exp1.setNumber(100, 50);
		exp2.setNumber(500, 100);
		
		System.out.println("Exp1");
		exp1.large();
		exp1.add();
		
		System.out.println("Exp2");
		exp2.large();
		exp2.add();
	}

}
