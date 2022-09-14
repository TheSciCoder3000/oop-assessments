import java.util.Scanner;

public class Item3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double hrs, min, sec, days, weeks;
		
		System.out.print("Input the number of hours: ");
		hrs = input.nextDouble();
		
		min = hrs*60;
		sec = hrs*3600;
		days = hrs/24.0;
		weeks = hrs/168.0;
		
		System.out.println("Seconds: " + sec);
		System.out.println("Minutes: " + min);
		System.out.println("Days: " + days);
		System.out.println("Weeks: " + weeks);
		
	}
}
