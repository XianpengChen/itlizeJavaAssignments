package interviewPrep;

import java.util.Scanner;
//dynamic programming
public class MaxApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] input = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < m; i++) {
            input[i][0] += input[i-1][0];
        }
        for (int j = 1; j < n; j++) {
            input[0][j] += input[0][j-1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                input[i][j] += Math.max(input[i-1][j], input[i][j-1]);
            }
            System.out.println(input[m-1][n-1]);
        }
    }
}
