import java.util.Scanner;

public class Item3 {

	public static void main(String[] args) {
		int arr_2d[][] = {
				{2, 150, 3, 9, 3, -9, 100, -8, -50, 40},
				{22, 11, -6, 23, 89, 23, 10, -3, 25, -3},
				{-8, -43, 56, 100, 32, 100, -9, 5, 20, 91},
				{-1, 2, -3, -4, 5, 6, 7, 8, 9, 10},
		};
		Scanner input = new Scanner(System.in);
		int FIND, count = 0;
		
		// ask user to enter the element to be queried
		System.out.print("Enter the value of element: ");
		FIND = input.nextInt();

		// loop through the 2d array
		for (int r = 0; r < arr_2d.length; r++) {
			for (int c = 0; c < arr_2d[r].length; c++) {
				if (arr_2d[r][c] == FIND) {
					count++;		 // if found then increase count counter
				}
			}
		}
		
		System.out.println("Element \"" + FIND + "\" found: " + count + " times");
	}

}
