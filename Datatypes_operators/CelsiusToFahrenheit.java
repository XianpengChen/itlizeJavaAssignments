package Datatypes_operators;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Please enter a Celsius temperature: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " Celsius degrees are " + toFahrenheit(celsius) + "Fahrenheit degrees.");
    }
    private static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
