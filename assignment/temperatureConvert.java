package assignment;

import java.util.Scanner;

public class temperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
