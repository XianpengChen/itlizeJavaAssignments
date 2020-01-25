package Datatypes_operators;
import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        System.out.print("Please enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 =scanner.nextDouble();
        System.out.println("The Largest of them is : " + getLargest(num1, num2, num3));
    }
    private static double getLargest(double num1, double num2, double num3) {
        double temp = Math.max(num1, num2);
        return Math.max(temp, num3);
    }
}
