package interviewPrep;

import java.util.Scanner;

public class Shift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num = 1;
        char a = s.charAt(0);
        char b = s.charAt(s.length() - 1);
        if (s.length() < 700000)
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == a && s.charAt(i - 1) == b) {
                    String temp = s.substring(i) + s.substring(0, i);
                    if (temp.equals(s))
                        num++;
                }
            }
        System.out.println(num);
        scanner.close();
    }
}