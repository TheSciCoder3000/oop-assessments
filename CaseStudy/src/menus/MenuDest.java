package menus;

public class MenuDest extends Menu{
	public MenuDest() {
		getUserChoices();
	}

	public void displayMenuQuestion() {
		System.out.print("Choose your travel course: ");
	}
	
	
	public void displayItems() {
		System.out.println("a. Dubai - Singapore");
		System.out.println("b. Rome - Venice");
		System.out.println("c. Rome - Miami");
		System.out.println("d. Miami - Los Angeles");
		System.out.println("e. Venice - Barcelona");
		System.out.println("f. Barcelona - London");
	}

	public String[][] initializeChoices() {
		String[][]options = {
				{"a","Dubai - Singapore", "3600"},
				{"b","Rome - Venice", "4500"},
				{"c","Rome - Miami", "3900"},
				{"d","Miami - Los Angeles", "4200" },
				{"e","Venice - Barcelona", "3800"},
				{"f","Barcelona - London", "4400"},
		};
		return options;
	}
	

}
