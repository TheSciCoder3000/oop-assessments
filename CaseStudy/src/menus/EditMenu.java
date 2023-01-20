package menus;

public class EditMenu extends Menu {
	public EditMenu() {
		getUserChoices();
	}

	public void displayMenuQuestion() {
		System.out.print(">>> ");
	}
	
	
	public void displayItems() {
		System.out.println("a. Time");
		System.out.println("b. Destination");
		System.out.println("c. Boat Type");
		System.out.println("d. Candel Edit");
	}

	public String[][] initializeChoices() {
		String[][]options = {
				{"a","Time"},
				{"b","Destination"},
				{"c","Boat Type"},
				{"d", "Cancel Edit"}
		};
		return options;
	}
	
}
