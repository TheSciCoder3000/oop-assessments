import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, insect, animal, verb, adjective;
		
		System.out.print("Please enter a name: ");
		name = input.nextLine();
		System.out.print("Please enter a insect: ");
		insect = input.nextLine();
		System.out.print("Please enter a animal: ");
		animal = input.nextLine();
		System.out.print("Please enter a verb: ");
		verb = input.nextLine();
		System.out.print("Please enter an adjective: ");
		adjective = input.nextLine();
		
		System.out.println("Take a little time " + name);
		System.out.println("See the " + insect + "'s color");
		System.out.println("Listen to the " + animal + " that were sent");
		System.out.println("To " + verb + " for me and you");
		System.out.println("Can you feel me");
		System.out.println("This is such a " + adjective + " place to be");
		
	}

}
