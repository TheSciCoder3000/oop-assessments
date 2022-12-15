package Item1;
import java.util.Scanner;

public class Player extends Character{
	static Scanner input = new Scanner(System.in);

	@Override
	public String NAME() {
		System.out.print("Enter the character's name: ");
		return input.nextLine();
	}

	@Override
	public String RACE() {
		String[] races = {"Human", "Elf", "Orc", "Angel", "Demon"};
		System.out.println("1 - Human\t4 - Angel\n2 - Elf\t\t5 - Demon\n3 - Orc");
		int race_indx = -1;
		do {
			System.out.print("Please enter your character's race [1 - 5]: ");
			race_indx = input.nextInt();
			input.nextLine();
			
		} while (race_indx < 1|| race_indx > 5);
		
		return races[race_indx-1];
		
	}
	
	@Override
	public int[] STATS() {
		int[] stats = new int[3];
		String[] statList = {"HP", "DEF", "ATK"};
		int stat_total = 0;
		boolean proceed = false;
		System.out.println("You have a total of 10 Stat points, please distribute them among HP, DEF, ATK");
		int stat_counter = 0;
		
		while(!proceed) {
			
			if (stat_counter != 0) {
				System.out.println("You only have " + (10-stat_total) + " left");
			}
			System.out.print(statList[stat_counter] + ": ");
			stats[stat_counter] = input.nextInt();
			stat_total += stats[stat_counter];
			if (stat_total > 10) {
				System.out.println("You exceeded! Try again");
				stat_total -= stats[stat_counter];
			} else if (stat_counter == 2) {
				proceed = true;
			} else {
				stat_counter++;
			}
			
		}
		
		input.nextLine();
		return stats;
	}

}
