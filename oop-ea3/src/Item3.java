import java.util.Scanner;

public class Item3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float volt = 0;
				
		do {
			System.out.print("Enter the voltage: ");
			volt = input.nextFloat();
			
			if (volt > 5) {
				System.out.println("BREAKDOWN MODE");
				break;
			} else if (volt < 5) {
				System.out.println("CUTOFF STATE");
				System.out.println("Terminating program");
			}
		} while (volt == 5);
	}

}
