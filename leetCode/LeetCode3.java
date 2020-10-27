package leetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) {
            return len;
        }
        int Max = 1;
        for (int i = 0; i < len - 1; i++) {
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i+1; j < len; j++) {
                Character temp = s.charAt(j);
                if (!set.contains(temp)) {
                    set.add(temp);
                }
                else {
                    break;
                }
            }
            Max = Math.max(Max, set.size());
        }
        return Max;
    }
}
