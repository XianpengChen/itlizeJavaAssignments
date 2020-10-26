package interviewPrep;

import java.util.Scanner;

public class TreeLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int knots = scanner.nextInt();
        int []tree = new int[knots];
        for (int i = 0; i < knots; i++) {
            tree[i] = -1;
        }
        for (int i = 0; i < knots-1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            tree[b] = a;
        }
        int high = 0;
        for (int i = 0; i < knots; i++) {
            int max = 1;
            int j=i;
            while (tree[j]!=-1) {
                max++;
                j = tree[j];
            }
            if (max > high) high = max;
        }
        System.out.println(high);

    }
}
