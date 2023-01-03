package menus;
import java.util.Scanner;

public abstract class Menu {
	String[][] choices = initializeChoices();
	public String choice = "";
	public String value;
	public int price;
	
	abstract void displayItems();						// used to display the menu choices
	abstract void displayMenuQuestion();				// used to display the question of the menu
	abstract String[][] initializeChoices();			// used to generate an array of choices
	
	// for validate the user's input based on the initialized choices
	boolean validateInput(String userInput) {
		for (int i = 0; i < choices.length; i++) {
			if (choices[i][0].equalsIgnoreCase(userInput)) {
				return true;
			}
		}
		return false;
	}
	
	// For requesting the user's input
	void getUserChoices() {
		Scanner input = new Scanner(System.in);
		boolean valid = false;
		
		System.out.println();
		displayItems();
		displayMenuQuestion();
		
		// parse user input
		do {
			choice = input.nextLine();
			
			// input validation
			if (validateInput(choice)) {
				valid = true;
				
				for (int i = 0; i < choices.length; i++) {
					if (choices[i][0].equals(choice)) {
						value = choices[i][1];
						price = choices[i].length == 3 ? Integer.parseInt(choices[i][2]) : 0;
					}
				}
			} else {
				System.out.println("Invalid Input, Please try again\n");
				displayMenuQuestion();
			}
		} while (!valid);
		
		
	}
}