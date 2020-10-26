package interviewPrep;

import java.util.Scanner;

public class FixedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            String temp = scanner.next();
            printString(temp, n);
        }
    }
    private static void printString(String curr, int n) {
        if(curr.length() <= n) {
            System.out.println(curr + addZero(n - curr.length()));
        }
        else {
            System.out.println(curr.substring(0, n));
            printString(curr.substring(n), n);
        }
    }
    private static String addZero(int a) {
        StringBuilder result = new StringBuilder();
        while (a > 0) {
            result.append("0");
            a--;
        }
        return result.toString();
    }
}
