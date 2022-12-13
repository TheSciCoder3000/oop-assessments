package Item1;
import java.util.Scanner;

public class Player extends Character{
	static Scanner input = new Scanner(System.in);

	@Override
	public String NAME() {
		return input.nextLine();
	}

	@Override
	public String RACE() {
		String[] races = {"Human", "Elf", "Orc", "Angel", "Demon"};
		System.out.println("1 - Human\t4 - Angel\n2 - Elf\t5 - Demon\n3 - Orc");
		int race_indx = -1;
		do {
			System.out.print("Please enter your character's race [1 - 6]: ");
			race_indx = input.nextInt();
			input.nextLine();
			
		} while (race_indx < 0 || race_indx > 6);
		
		return races[race_indx-1];
		
	}

	@Override
	public int[] STATS() {
		int[] stats = new int[3];
		String[] statList = {"HP", "DEF", "ATK"};
		int statPts = 0;
		boolean proceed = false;
		System.out.println("You have a total of 10 Stat points, please distribute them among HP, DEF, ATK");
		
		do {
			for (int s = 0; s < statList.length; s++) {
				System.out.print(statList[s] + ": ");
				stats[s] = input.nextInt();
				statPts += stats[s];			
			}
			
			input.nextLine();
			
			if (statPts > 10) {
				System.out.println("You have exceeded the given 10 stat points, please try again");
			} else if (statPts < 10) {
				System.out.print("Are you sure you want to proceed with \nonly " + statPts + "distributed stat points [Y/N]?");
				proceed = (input.nextLine().equalsIgnoreCase("Y")) ? true : false;
			}
		} while (statPts > 10 || !proceed);
		
		return stats;
	}

}
