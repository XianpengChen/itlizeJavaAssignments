package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = 2;
        String[] lines = new String[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            lines[i] = scanner.nextLine();
        }
        Scanner scanner1 = new Scanner(lines[1]);
        int location = scanner1.nextInt();
        Scanner scanner2 = new Scanner(lines[0]);
        List<Integer> numbers = new ArrayList<>();
        while (scanner2.hasNextInt()) {
            int temp = scanner2.nextInt();
            if (temp > 0) {
                int value = temp % 1000;
                numbers = insertToList(numbers, value);
            }
        }
        System.out.println(numbers.get(location-1));
    }
    private static List<Integer> insertToList(List<Integer> list, int a) {
        List<Integer> result = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            if (a < list.get(i)) {
                result.add(i, a);
                return result;
            }
        }
        result.add(a);
        return result;

    }
}
