package loopStatements;

import sun.plugin2.message.JavaScriptGetWindowMessage;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum = sum(1, 100);
        System.out.println("The sum from 1 to 100 is " + sum);
        double avg = average(1, 100);
        System.out.println("The average from 1 to 100 is " + avg);
        double avg1 = sumOnlyOddAndAverage(1,100);
        System.out.println("To sum only the odd numbers from 1 to 100, " +
                "and compute the average. The average is "+ avg1);
        double avg2 = sumOnlySevenAndAverage(1, 100);
        System.out.println("Too sum those numbers from 1 to 100 that is divisible" +
                " by 7, and compute the average. The average is " + avg2);
        int sumOfSquares = sumOfSquares(1, 100);
        System.out.println("the sum of squares from 1 to 100 is " + sumOfSquares);

    }
    private static int sum(int from, int to) {
        int temp = 0;
        for (int i = from; i <= to; i++) {
            temp += i;
        }
        return temp;
    }
    private static double average(int from, int to) {
        int sum = sum(from, to);
        double count = to - from + 1;
        return (double) (sum / count);
    }
    private static double sumOnlyOddAndAverage(int from, int to) {
        int temp = 0;
        double counter = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                temp += i;
                counter += 1;
            }
        }
        return temp/counter;
    }
    private static double sumOnlySevenAndAverage(int from, int to) {
        int temp = 0;
        double counter = 0;
        for (int i = from; i <= to; i++) {
            if (i % 7 == 0) {
                temp += i;
                counter += 1;
            }
        }
        return temp/counter;
    }

    private static int sumOfSquares(int from, int to) {
        int temp = 0;
        for (int i = from; i <= to; i++) {
            temp = temp + i*i;
        }
        return temp;
    }
}
