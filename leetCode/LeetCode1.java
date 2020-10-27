package leetCode;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
