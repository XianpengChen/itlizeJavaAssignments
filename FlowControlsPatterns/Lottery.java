package FlowControlsPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lotteryNumber = (int) (Math.random() * 1000);
        String inStringFormat = String.format("%3s", lotteryNumber);
        System.out.println(inStringFormat);
        List<String> lotteryDigits = toList(inStringFormat);

        System.out.print("Please enter a 3-digit number to win lottery: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        List<String> userInputDigits = toList(userInput);
        if (fullyMatched(lotteryDigits, userInputDigits)) {
            System.out.println("the user input matches the lottery number in the exact order, the award is\n" +
                    "$10,000");
        }
        else {
            int digitsMatched = numberOfDigitsMatched(userInputDigits, lotteryDigits);
            switch (digitsMatched) {
                case 1:
                    System.out.println("one digit in the user input matches a digit in the lottery number, the award is\n" +
                            "$1,000.");
                    break;
                case 3:
                    System.out.println("all the digits in the user input match all the digits in the lottery number, the\n" +
                            "award is $3,000");
                    break;
                default:
                    System.out.println("no rewards!");
            }
        }

    }

    /**
     * to check if two lists of string have the same elements;
     * @param l1 list of string
     * @param l2 list of string
     * @return true if they have the same elements, otherwise false.
     */
    private static boolean fullyMatched(List<String> l1, List<String> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }
        else {
            for (int i = 0; i < l1.size(); i++) {
                if (!l1.get(i).equals(l2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * count how many elements in l1 are also contained in l2
     * @param l1 list of string
     * @param l2 list of string
     * @return
     */
    private static int numberOfDigitsMatched(List<String> l1, List<String> l2) {
        int counter = 0;
        for (String str : l1) {
            if (l2.contains(str)) {
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * @param input string representation of int such as "354678"
     * @return a list of String such as["3", "4", "5", "6", "7", "8"]
     */
    private static List<String> toList(String input){
        int length = input.length();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            result.add(String.valueOf(input.charAt(i)));
        }
        return result;
    }

}
