package Datatypes_operators;

import java.util.Scanner;

public class ConvertMinutesIntoYearsDays {
    public static void main(String[] args) {
        System.out.print("Please enter minutes: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(toYearsAndDays(input));
    }
    private static String toYearsAndDays(int minutes) {
        int years;
        int days;
        years = minutes / 525600;
        days = (minutes % 525600) / 1440;
        return minutes + " minutes is approximately " + years + " years and " + days +" days.";
    }
}
