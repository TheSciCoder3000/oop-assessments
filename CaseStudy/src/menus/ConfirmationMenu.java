package menus;

public class ConfirmationMenu extends Menu{
	public ConfirmationMenu() {
		getUserChoices();
	}

	public void displayMenuQuestion() {
		System.out.print(">>> ");
	}
	
	
	public void displayItems() {
		System.out.println("a. Edit");
		System.out.println("b. Proceed to Payment");
		System.out.println("c. Cancel Transaction");
	}

	public String[][] initializeChoices() {
		String[][]options = {
				{"a","Edit"},
				{"b","Proceed to Payment"},
				{"c","Cancel Transaction"}
		};
		return options;
	}
}
