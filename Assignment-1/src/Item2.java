import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mps, kpm;
		
		System.out.print("Enter the speed of superman in m/s: ");
		mps = input.nextDouble();
		
		kpm = mps * (60.0 / 1000.0);
		
		System.out.println("It will take superman " + (50.0/kpm) + " mins to travel 50km");
	}

}
