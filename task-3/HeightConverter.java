import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {

		final float FEET_TO_CM = 30.48f;
		final float INCHES_TO_CM = 2.54f;
		int heightFeet = 0;					// User input height in feet
		int heightInches = 0;				// User input height in inches

		// Create scanner for reading the command-line input
		Scanner scanner = new Scanner(System.in);
		
		// Capture user input into appropriate variables
		try {
			System.out.println("Please enter your height in feet and inches:");
			System.out.println("Feet:");
			heightFeet = Integer.parseInt(scanner.next());
			System.out.println("Inches:");
			heightInches = Integer.parseInt(scanner.next());
		} catch (Exception e) {
			System.out.println("Invalid input! " + e.getMessage());
			System.out.println("Please enter numerical values for your height");
			System.exit(1);
		}
		
		float heightCentimeters = (FEET_TO_CM * heightFeet) + (INCHES_TO_CM * heightInches);
		System.out.println("Your height in centimeters is: " + heightCentimeters +  " centimeters");
	}
}
