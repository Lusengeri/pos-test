import java.util.Scanner;

public class Exercise1 {

	public static void main (String[] args) {

		System.out.println("What conversion do you want to perform:");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");

		Scanner scanner = new Scanner(System.in);
		int userChoice = Integer.parseInt(scanner.next());

		Double userInput;

		if (userChoice == 1) {
			System.out.print("Temperature in degrees celsius: ");
			userInput = Double.parseDouble(scanner.next());
			System.out.println(userInput + " degrees Celsius in Fahrenheit: " + celsToFahr(userInput));
		} else {
			System.out.print("Temperature in degrees Fahrenheit: ");
			userInput = Double.parseDouble(scanner.next());
			System.out.println(userInput + " degrees Fahrenheit in Celsius: " + fahrToCels(userInput));
		}
	}

	private static double celsToFahr(Double cels) {
		return (cels * 1.8) + 32.0;		
	}

	private static double fahrToCels(Double fahr) {
		return (fahr - 32) * (5/9);
	}
}
