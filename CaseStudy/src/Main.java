import java.util.Scanner;

import menus.ConfirmationMenu;
import menus.EditMenu;
import menus.MenuDest;
import menus.MenuType;
import menus.Payment;
import menus.TimeMenu;

public class Main {

	public static void main(String[] args) {
		boolean transaction = true;
		
		// main transaction loop
		while (transaction) {
			System.out.println("===========================================");
			System.out.println("\tWELCOME TO LA SALLE EXPRESS");
			System.out.println("===========================================");
			System.out.println("Please enter the details your details...");
			
			// transaction initialization
			TimeMenu TMenu = new TimeMenu();
			MenuDest Destination = new MenuDest();
			MenuType BoatType = new MenuType();
			
			
			// confirmation phase
			boolean proceed = false;
			while (!proceed) {
				// Display transaction details
				System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
				System.out.println("\tTRANSACTION DETAILS");
				System.out.println("++++++++++++++++++++++++++++++++++++++++\n");
				System.out.println("Length of stay: \t" + TMenu.value);
				System.out.println("Destination: \t\t" + Destination.value);
				System.out.println("Boat Type: \t\t" + BoatType.value);
				ConfirmationMenu confirmation = new ConfirmationMenu();
				
				// to redirect the program based on the user's decision
				Scanner input = new Scanner(System.in);
				String res;
				switch (confirmation.value) {
					case "Edit":
						System.out.println("\n+++++++++++++++++++++++++++");
						System.out.println("\t EDITING");
						System.out.println("+++++++++++++++++++++++++++");
						System.out.println("Choose which among do you wish to edit:");
						EditMenu EMenu = new EditMenu();
						switch(EMenu.choice) {
							case "a":
								TMenu = new TimeMenu();
								break;
							case "b":
								Destination = new MenuDest();
								break;
							case "c":
								BoatType = new MenuType();
								break;
							default:
								System.out.println("Canceling Edit");
						}
						break;
						
					case "Proceed to Payment":
						Payment pay = new Payment(BoatType.price, Destination.price, TMenu.price);
						pay.PAYMENT();
						pay.CHECKING();
						pay.RECEIPT();
						// ask whether to start a new transaction with input validation
						do {
							System.out.print("Would you like to make a new transaction? [Y/N]: ");
							res = input.nextLine();
							transaction = res.equalsIgnoreCase("Y") ? true : false;
						} while (!res.equalsIgnoreCase("Y") && !res.equalsIgnoreCase("N"));
						
						proceed = true;			// stop the confirmation loop
						break;
						
					case "Cancel Transaction":
						System.out.println("Canceling current transaction\n\n");
						
						// ask whether to start a new transaction with input validation
						do {
							System.out.print("Would you like to make a new transaction? [Y/N]: ");
							res = input.nextLine();
							transaction = res.equalsIgnoreCase("Y") ? true : false;
						} while (!res.equalsIgnoreCase("Y") && !res.equalsIgnoreCase("N"));
						
						proceed = true;			// stop the confirmation loop
						break;
						
					default:
						System.out.println("Error: Something went wrong, What did you do?");
				}
				
			}
		}
		
		System.out.println("\nEnd of Transaction, Thank you and come again!!");
		
	}

}
