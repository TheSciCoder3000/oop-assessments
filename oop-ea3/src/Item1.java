import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username;
		int passcode;
		boolean auth = false;
		
		while (!auth) {
			System.out.print("username: ");
			username = input.nextLine();
			System.out.print("passcode: ");
			passcode = input.nextInt();
			
			input.nextLine();
			
			if (username.equals("user_student") && passcode == 202201225) {
				System.out.println("User has been authenticated");
				auth = true;
			} else {
				System.out.println("Error: wrong username or passcode");
				System.out.println("Please try again\n");
			}
		}
		

	}

}
