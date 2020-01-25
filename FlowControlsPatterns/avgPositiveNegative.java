package FlowControlsPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//5. (Count positive and negative numbers and compute the average of numbers) Write
//a program that reads an unspecified number of integers, determines how many
//positive and negative values have been read, and computes the total and average of
//the input values (not counting zeros). Your program ends with the input 0. Display
//the average as a floating-point number. Here is a sample run:
//Enter an integer, the input ends if it is 0:1 2 -1 3 0
//The number of positives is 3
//The number of negatives is 1
//The total is 5
//The average is 1.25
//
//or
//
//Enter an integer, the input ends if it is 0:
//No numbers are entered except 0
//0

public class avgPositiveNegative {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.print("Please enter your integers(ends with zero): ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            list.add(temp);
            if (temp == 0) {
                scanner.close();
                break;
            }
        }
        if (list.size() == 1 & list.get(0) == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else {
            int numberOfPositives = count(list, 1);
            int numberOfNegatives = count(list, -1);
            int total = total(list);
            float avg = avg(list);
            System.out.println("The number of positives is " + numberOfPositives);
            System.out.println("The number of negatives is " + numberOfNegatives);
            System.out.println("The total is " + total);
            System.out.println("The average is " + avg);

        }


    }

    /**
     * count the number of negative or positive integers in given list;
     * @param l1 list of integer
     * @param negativeOrPositive -1 if we are counting negatives, 1 if we are counting positives;
     * @return the number of negative or positive integers in given list
     */
    private static int count(List<Integer> l1, int negativeOrPositive) {
        int counter = 0;
        for (Integer in : l1) {
            if (in * negativeOrPositive > 0) {
                counter += 1;
            }
        }
        return counter;
    }
    private static int total(List<Integer> l1) {
        int total = 0;
        for(Integer in : l1) {
            total += in;
        }
        return total;
    }
    private static float avg(List<Integer> l1) {
        int total = total(l1);
        return (float) (total * 1.0 / (l1.size() - 1));
    }
}
