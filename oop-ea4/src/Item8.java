import java.util.Scanner;

public class Item8 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float l = inputLength();
		float w = inputWidth();
		
		System.out.println("The shape " + (analyze(l, w) ? "IS" : "IS NOT") + " a square");
		compute(l, w);
	}
	
	static float inputLength() {
		System.out.print("Enter the length: ");
		return input.nextFloat();
	}
	
	static float inputWidth() {
		System.out.print("Enter the width: ");
		return input.nextFloat();
	}
	
	static boolean analyze(float length, float width) {
		return length == width;
	}
	
	static void compute(float length, float width) {
		float area = length*width;
		float perimeter = 2*(length + width);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}

}
