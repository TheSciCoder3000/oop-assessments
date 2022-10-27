package Item4;

public class Item4 {

	public static void main(String[] args) {
		Detector detect = new Detector();
		int input = detect.getInput();
		String result = detect.validate(input);
		System.out.println("The number is " + result);
	}

}