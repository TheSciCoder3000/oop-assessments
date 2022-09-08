import java.util.Scanner;

public class Item5 {

	public static void main(String[] args) {
		// initialize variables
		Scanner input = new Scanner(System.in);
		double SWA, SWB;
		String SWA_state, SWB_state;
		
		// get user input
		System.out.print("Enter the voltage of SWA switch: ");
		SWA = input.nextDouble();
		SWA_state = SWA < 5 ? "CUTOFF" : SWA == 5 ? "ACTIVE" : "BREAKDOWN";
		System.out.print("Enter the voltage of SWB switch: ");
		SWB = input.nextDouble();
		SWB_state = SWB < 5 ? "CUTOFF" : SWB == 5 ? "ACTIVE" : "BREAKDOWN";
		
		// print result
		System.out.println("SWA State: " + SWA_state);
		System.out.println("SWB State: " + SWB_state);
		if (SWB_state.equals("ACTIVE") || SWA_state.equals("ACTIVE")) {
			System.out.println("LED ON");
		} else {
			System.out.println("LED OFF");
		}
	}

}
