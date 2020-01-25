package Datatypes_operators;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextInt();
        System.out.print("Input hours: ");
        int hours = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input distance in seconds: ");
        int seconds = scanner.nextInt();
        double MetersPerSecond = distance / (hours * 60 * 60 + minutes * 60 + seconds);
        double kmPerHour = distance * 0.001 / (hours + minutes / 60.0 + seconds /3600.0);
        double milesPerHour = 0.621371 * kmPerHour;
        System.out.println("Your speed in meters/seconds is " + MetersPerSecond);
        System.out.println("Your speed in km/h is " + kmPerHour);
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }
}
