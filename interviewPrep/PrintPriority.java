package interviewPrep;

import java.util.*;

public class PrintPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            input.add(scanner.nextInt());
        }
        int[] result = priority(input);
        for (int i: result) {
            System.out.print(i + ", ");
        }

    }
    private static int[] priority(List<Integer> jobs) {
        int[] copy = new int[jobs.size()];
        int[] result = new int[jobs.size()];

        HashMap<Integer, Integer> PriorityMapToOrder = new HashMap<>();
        for (int i = 0; i < jobs.size(); i++) {
            PriorityMapToOrder.put(jobs.get(i), i);
            copy[i] = jobs.get(i);
        }
        Arrays.sort(copy);
        for (int i = jobs.size() - 1; i >= 0; i--) {
            result[jobs.size() - 1 - i] = PriorityMapToOrder.get(copy[i]);
        }
        return result;

    }
}
