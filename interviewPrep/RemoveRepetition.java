package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        List<Character> appeared = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!appeared.contains(str.charAt(i))) {
                System.out.print(str.charAt(i));
                appeared.add(str.charAt(i));
            }
        }
    }
}
