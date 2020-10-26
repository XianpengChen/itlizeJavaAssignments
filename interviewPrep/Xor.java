package interviewPrep;

import java.util.Scanner;

public class Xor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        TreeNode root = new TreeNode(-1);
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            insert(root, num);
            nums[i] = num;
        }

        long result = 0;
        for (int num : nums) {
            result += query(root, num, m, 31);
        }

        System.out.println(result / 2);
    }

    private static void insert(TreeNode root, int number) {
        TreeNode prev = root;
        for(int i = 31; i >= 0; i--){
            int digit = (number >> i) & 1;
            if (digit == 0) {
                if (prev.left == null) {
                    prev.left = new TreeNode(digit);
                }

                prev = prev.left;
                prev.count++;
                continue;
            }

            if (prev.right == null) {
                prev.right = new TreeNode(digit);
            }
            prev = prev.right;
            prev.count++;
        }
    }

    private static long query(TreeNode root, int number, int m, int k){
        if(root == null){
            return 0;
        }

        int mDigit = (m >> k) & 1;
        int aDigit = (number >> k) & 1;
        if(mDigit == 1 && aDigit == 1){
            return query(root.left, number, m, k - 1);
        }

        if(mDigit == 1 && aDigit == 0){
            return query(root.right, number, m, k - 1);
        }

        if(mDigit == 0 && aDigit == 0){
            return query(root.left, number, m, k - 1) + (root.right == null ? 0 : root.right.count);
        }

        if(mDigit == 0 && aDigit == 1){
            return query(root.right, number, m, k - 1) + (root.left == null ? 0 : root.left.count);
        }

        return 0;
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int digital;
        long count;

        TreeNode(int digital) {
            this.digital = digital;
        }
    }
}