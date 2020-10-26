package interviewPrep;

import java.util.HashMap;
import java.util.Scanner;

public class PingYingToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String curr = scanner.next();
        HashMap<String, Integer> conversion = new HashMap<>();
        conversion.put("yi", 1);
        conversion.put("er", 2);
        conversion.put("san", 3);
        conversion.put("si", 4);
        conversion.put("wu", 5);
        conversion.put("liu", 6);
        conversion.put("qi", 7);
        conversion.put("ba", 8);
        conversion.put("jiu", 9);
        int a = curr.length();
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < a) {
            String temp = curr.substring(index, index+2);
            if (conversion.get(temp) != null) {
                result.append(conversion.get(temp));
                index = index + 2;
            }
            else {
                String temp3 = curr.substring(index, index+3);
                result.append(conversion.get(temp3));
                index = index + 3;
            }
        }
        System.out.println(result);
    }
}
