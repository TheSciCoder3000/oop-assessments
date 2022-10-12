import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		int my_arr[] = {10, -5, 31, 9, -11, 0, 4, 16, 18, 3};
		Scanner input = new Scanner(System.in);
		int num;
		boolean found = false;
		
		// get element value from user
		System.out.print("Enter value of element: ");
		num = input.nextInt();
		
		// loop through the elements of my_arr
		for (int i = 0; i < my_arr.length; i++ ) {
			if (my_arr[i] == num) {
				System.out.println("\nArray Index: " + i);
				found = true;		// set found true
				break;				// terminate the loop
			}
		}
		
		// if element is not found then alert user
		if (!found) {
			System.out.println("\nNot Element Found");
		}
	}

}
