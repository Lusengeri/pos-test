import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise2 {

	public static void main (String[] args) {

		System.out.println("Enter a temperature value (Celsius or Fahrenheit):");

		Scanner scanner = new Scanner(System.in);
		Double userInput = Double.parseDouble(scanner.next());

		DecimalFormat df = new DecimalFormat("###.##");

		System.out.println("-> " + userInput + " degrees Celsius in degrees Fahrenheit: " + df.format(celsToFahr(userInput)));
		System.out.println("-> " + userInput + " degrees Fahrenheit in degrees Celsius: " + df.format(fahrToCels(userInput)));
	}

	private static Double celsToFahr(Double cels) {
		return (cels * 1.8) + 32.0;		
	}

	private static Double fahrToCels(Double fahr) {
		return (fahr - 32.0) * (5.0/9.0);
	}
}
