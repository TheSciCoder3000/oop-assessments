package menus;

public class MenuType extends Menu{
	public MenuType() {
		getUserChoices();
	}

	public void displayItems() {
		System.out.println("a. Black Pearl");
		System.out.println("b. Queen Anne");
		System.out.println("c. Going Merry");
		System.out.println("d. Thousand Sunny");
	}

	public void displayMenuQuestion() {
		System.out.print("Choose your cruise ship: ");
	}

	public String[][] initializeChoices() {
		String[][]options = {
				{"a","Black Pearl", "5000"},
				{"b","Queen Anne", "4400"},
				{"c","Going Merry", "4300"},
				{"d","Thousand Sunny", "4700"}
		};
		return options;
	}
	
}
