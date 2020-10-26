package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> stocks = new ArrayList<>();
        while (scanner.hasNextInt()) {
            stocks.add(scanner.nextInt());
        }
        for (Integer in: stocks) {
            System.out.println(value(in));
        }

    }
    private static int value(int days) {
        int plus = 1;
        int minus = -1;
        int value = 1;
        boolean rise = true;
        int validDays = days - 1;
        while ( validDays > 0) {
            if (rise) {
                if (validDays - plus >= 0) {
                    value = value + plus;
                    validDays = validDays - plus;
                    plus++;
                    rise = false;
                }
                else {
                    int realPlus = plus + (validDays - plus);
                    value = value + realPlus;
                    validDays = 0;
                    break;
                }
            }
            else {
                value = value + minus;
                validDays = validDays - 1;
                rise = true;
            }
        }
        return value;
    }
}
