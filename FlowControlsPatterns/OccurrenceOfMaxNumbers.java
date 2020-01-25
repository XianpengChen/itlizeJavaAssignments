package FlowControlsPatterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.print("Please enter your numbers(ends with zero): ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            list.add(temp);
            if (temp == 0) {
                scanner.close();
                break;
            }
        }
        int largest = findLargest(list);
        int occurrence = countOccurrence(list, largest);
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count of the largest number is " + occurrence);
    }

    private static int findLargest(List<Integer> l1) {
        int temp = l1.get(0);
        for (Integer in : l1) {
            if (in > temp) {
                temp = in;
            }
        }
        return temp;
    }

    private static int countOccurrence(List<Integer> l1, int largest) {
        int counter = 0;
        for (Integer in : l1) {
            if (largest == in) {
                counter += 1;
            }
        }
        return counter;
    }
}
