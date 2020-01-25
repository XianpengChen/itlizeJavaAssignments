package FlowControlsPatterns;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        System.out.print("Enter a decimal value (0 to 15): ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(toHex(input));
    }
    private static String toHex(int input) {
        String result = "";
        if (input >= 0 & input <= 9) {
            result = Integer.toString(input);
            result = "The hex value is " + result;
        }
        else if (input >= 10 & input <= 15) {
            switch (input) {
                case 10: result = "A";
                         break;
                case 11: result = "B";
                         break;
                case 12: result = "C";
                         break;
                case 13: result = "D";
                    break;
                case 14: result = "E";
                    break;
                case 15: result = "F";
            }
            result = "The hex value is " + result;
        }
        else {
            result = "Invalid input";
        }
        return result;
    }
}
