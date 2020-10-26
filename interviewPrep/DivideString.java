package interviewPrep;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        String out = divideString(str);
        System.out.println(out);

    }
    private static String divideString(String input) {
        boolean flag = true;
        boolean flag2 = false;
        StringBuilder result = new StringBuilder();
        int len = input.length();
        for (int i =0; i < len; i++) {
            if (input.charAt(i) != ' ') {
                result.append(input.charAt(i));
                flag2 = true;
                flag = true;
            }
            else {
                if (flag && flag2) {
                    result.append(",");
                    flag = false;
                }
            }
        }
        result.append(",");
        return result.toString();
    }
}
