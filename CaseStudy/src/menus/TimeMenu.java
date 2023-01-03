package menus;

public class TimeMenu extends Menu{
	public TimeMenu() {
		getUserChoices();
	}

	public void displayMenuQuestion() {
		System.out.print("Enter the amount of time you'll be staying: ");
	}
	
	
	public void displayItems() {
		System.out.println("a. 5 hrs");
		System.out.println("b. 12 hrs");
		System.out.println("c. 1 day");
		System.out.println("d. 2 days");
	}

	public String[][] initializeChoices() {
		String[][]options = {
				{"a","5 hrs", "750"},
				{"b","12 hrs", "1400"},
				{"c","1 day", "1600"},
				{"d","2 days", "2200"}
		};
		return options;
	}
}
