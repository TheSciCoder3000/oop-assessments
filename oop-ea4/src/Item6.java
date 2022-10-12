import java.util.Scanner;

public class Item6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int POS[] = {-1, -1, -1, -1, -1};
		int num, counter = 0;
		
		while (POS[4] < 0) {
			System.out.print("Enter a positive number: ");
			num = input.nextInt();
			
			if (positive(num)) {
				POS[counter] = num;
				counter++;
			}
		}
		
		display(POS);

	}
	
	static boolean positive(int a) {
		return a > 0;
	}
	
	static void display(int[] arr) {
		System.out.println("\nThe Values of the array:");
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}

}
