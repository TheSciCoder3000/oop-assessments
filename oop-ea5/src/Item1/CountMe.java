package Item1;

public class CountMe {
	private int X;
	
	public int setValues(int set_x, int LEFT, int RIGHT) {
		X = set_x;
		if (LEFT == RIGHT) {
			return 0;
		} else if (LEFT > RIGHT) {
			return 1;
		} else {
			return 2;			
		}
	}
	
	public void displayCount(int status) {
		if (status == 0) {
			System.out.println("Equal Value");
			return;
		}
		
		int counter = X;
		for (int i = 0; i < 10; i++) {
			System.out.println(counter);
			if (status == 1) {
				counter--;
			} else {
				counter++;
			}
		}
	}
}
