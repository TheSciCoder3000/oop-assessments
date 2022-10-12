
public class Item2 {

	public static void main(String[] args) {
		int my_arr[] = {10, -5, 31, 9, -11, 0, 4, 16, 18, 3};
		int pos_sum = 0, neg_sum = 0;
		
		// loop through the array
		for (int i = 0; i < my_arr.length; i++) {
			// if array is a negative number
			if (my_arr[i] < 0) {
				neg_sum += my_arr[i];		// add to negative sum
			} else {
				pos_sum += my_arr[i];		// else add to positive sum
			}
		}
		
		System.out.println("Sum of Positive Numbers: " + pos_sum);
		System.out.println("Sum of Negative Numbers: " + neg_sum);
	}

}
