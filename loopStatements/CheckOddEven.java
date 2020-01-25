package loopStatements;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int inputVariable = scanner.nextInt();
        oddOrEven(inputVariable);
        System.out.println("BYE!");

    }
    private static void oddOrEven(int number) {
        switch (number % 2) {
            case 0:
                System.out.println("the number " + number + " is even.");
                break;
            case 1:
                System.out.println("the number " + number + " is odd.");
                break;
        }
    }
}
