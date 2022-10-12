
public class Item4 {

	public static void main(String[] args) {
		int arr_2d[][] = {
				{2, 150, 3, 9, 3, -9, 100, -8, -50, 40},
				{22, 11, -6, 23, 89, 23, 10, -3, 25, -3},
				{-8, -43, 56, 100, 32, 100, -9, 5, 20, 91},
				{-1, 2, -3, -4, 5, 6, 7, 8, 9, 10},
		};
		int lg_row[] = new int[arr_2d.length];
		int lg = 0;

		// loop through the 2d array
		for (int r = 0; r < arr_2d.length; r++) {
			// loop through the elements of each row
			for (int c = 0; c < arr_2d[r].length; c++) {
				if (c == 0 || lg_row[r] < arr_2d[r][c]) {
					lg_row[r] = arr_2d[r][c];		// assign as largest in row
				}
			}
			
			// display the largest value in the current row
			System.out.println("The largest number in row " + (r+1) + " is: " + lg_row[r]);
			
			if (r == 0 || lg < lg_row[r]) {
				lg = lg_row[r];		// assign as largest in array
			}
		}
		
		System.out.println("The largest number in the array is: " + lg);
	}

}
