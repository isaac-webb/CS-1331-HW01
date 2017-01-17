/**
 * Created by iwebb on 1/14/17.
 *
 * This is a simple program that prompts a user to enter a temperature in Fahrenheit and prints the corresponding value
 * in Celsius.
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create the Scanner that will gather input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the temperature in Fahrenheit: ");

        // Get the value they enter
        double degreesF = inputScanner.nextDouble();

        // Convert it to celsius
        double degreesC = (degreesF - 32) * 5 / 9;

        // Print the result for the user
        System.out.printf(degreesF + " degrees Fahrenheit is %.2f degrees Celsius.\n", degreesC);
    }
}
