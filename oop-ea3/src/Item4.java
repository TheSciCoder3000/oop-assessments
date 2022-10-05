import java.util.Scanner;

public class Item4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width, height;
		char character;
		
		System.out.print("Width: ");
		width = input.nextInt();
		System.out.print("Height: ");
		height = input.nextInt();
		input.nextLine();
		System.out.print("Character: ");
		character = input.nextLine().charAt(0);
		
		for (int r = 0; r < height; r++) {
			for (int c = 0; c < width; c++) {
				System.out.print(character);
			}
			System.out.println("");
		}
	}

}
