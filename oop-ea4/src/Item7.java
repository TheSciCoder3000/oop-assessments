import java.util.Scanner;

public class Item7 {

	public static void main(String[] args) {
		String motto = inputMotto();
		Scanner input = new Scanner(System.in);
		int fav_num;
		
		System.out.print("Enter your favorite number: ");
		fav_num = input.nextInt();
		
		displayMotto(fav_num, motto);

	}
	
	static String inputMotto() {
		Scanner input = new Scanner(System.in);
		String motto;
		
		System.out.print("Enter your motto: ");
		motto = input.nextLine();
		
		return motto;
	}
	
	static void displayMotto(int X, String motto) {
		for (int i = 0; i < X; i++) {
			System.out.println(motto);
		}
	}

}
