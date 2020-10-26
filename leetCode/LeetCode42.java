package leetCode;

import java.util.Scanner;

public class LeetCode42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] height = {2,1,0,2,1,0,1,3,2,1,2,1};
        Solution so = new Solution();
        System.out.println(so.trap(height));
    }
}

class Solution {
    public int trap(int[] height) {
      int length = height.length;
      int[] left = new int[length];
      int[] right = new int[length];
      int leftMax = 0;
      int rightMax = 0;
      int sum = 0;

      for (int i = 0; i < length; i++) {
          if (height[i] > leftMax) {
              leftMax = height[i];
          }
          left[i] = leftMax;
          if (height[length-1-i] > rightMax) {
              rightMax = height[length-1-i];
          }
          right[length-1-i] = rightMax;
      }
      for (int j = 0; j < length; j++) {
          if (height[j] < left[j] && height[j] < right[j]) {
              sum += Math.min(left[j], right[j]) - height[j];
          }
      }
      return sum;
    }
}
