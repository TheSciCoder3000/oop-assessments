package Item1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int player_count = 2;
		
		String[] name = new String[player_count], race = new String[player_count];
		int[][] stats = new int[player_count][3];
		
		for (int p = 0; p < player_count; p++) {
			System.out.println("\nPlease enter Player  " + (p+1) + " Details:");
			Player player = new Player();
			name[p] = player.NAME();
			race[p] = player.RACE();
			stats[p] = player.STATS();			
		}
		
		System.out.println("\n===========================================");
		for (int p = 0; p < player_count; p++) {
			System.out.println("\nPlayer " + (p+1) + " Details:");
			System.out.println("Name: " + name[p]);
			System.out.println("Race: " + race[p]);
			System.out.println("HP: " + stats[p][0]);
			System.out.println("DEF: " + stats[p][1]);
			System.out.println("ATK: " + stats[p][2]);
		}
		System.out.println("===========================================");
		input.close();
	}

}
