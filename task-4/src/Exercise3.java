import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {

	public static void main (String[] args) {

		System.out.println("Enter a temperature value (Celsius or Fahrenheit):");
		Scanner scanner = new Scanner(System.in);
		Double userInput = Double.parseDouble(scanner.next());

		if (userInput == 0.0) {
			printConversionTable();
		} else {
			DecimalFormat df = new DecimalFormat("###.##");
			System.out.println("-> " + userInput + " degrees Celsius in degrees Fahrenheit: " + df.format(celsToFahr(userInput)));
			System.out.println("-> " + userInput + " degrees Fahrenheit in degrees Celsius: " + df.format(fahrToCels(userInput)));
		}
	}

	private static Double celsToFahr(Double cels) {
		return (cels * 1.8) + 32.0;	
	}

	private static Double fahrToCels(Double fahr) {
		return (fahr - 32.0) * (5.0/9.0);
	}

	private static void printConversionTable() {

		System.out.println("Celsius\t\tFahrenheit");

		for (int count = -20; count < 26; count+=5) {
			Double temperature = Double.valueOf(count);
			System.out.printf("%.2f \t\t %.2f\n", temperature, celsToFahr(temperature));
		}
	}
}
