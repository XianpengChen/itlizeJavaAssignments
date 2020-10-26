package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        for (String str : lines) {
            System.out.println(reverse(str));
        }
    }
    private static String reverse (String str) {
        String[] sp = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = sp.length - 1; i >= 0; i--) {
            sb.append(" ").append(sp[i]);
        }
        return sb.substring(1);
    }
}
