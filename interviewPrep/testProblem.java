package interviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class testProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int[] problems = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            problems[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(problems);

        int need = 0;
        int order = 0;
        int prev = 0;
        int i = 0;
        while (i < numbers) {
            if (order == 0) {
                prev = problems[i];
                i++;
            }
            else if (order == 1) {
                if (prev + 10 >= problems[i]) {
                    prev = problems[i];
                    i++;
                }
                else {
                    need++;
                    prev = prev + 10;
                }
            }
            else if (order == 2) {
                if (prev + 10 >= problems[i]) {
                    prev = problems[i];
                    i++;
                }
                else {
                    need++;
                    prev = prev + 10;
                }
            }
            order = (order + 1) % 3;
        }
        need = (3-order) % 3 + need;
        System.out.println(need);
    }
}
