/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Map<Integer, Integer> lenMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (lenMap.containsKey(num)) {
                continue;
            }
            int leftLen = lenMap.getOrDefault(num-1, 0);
            int rightLen = lenMap.getOrDefault(num+1, 0);
            int currLen = 1 + leftLen + rightLen;
            if (currLen > maxLen) {
                maxLen = currLen;
            }
            lenMap.put(num, currLen);
            lenMap.put(num-leftLen, currLen);
            lenMap.put(num+rightLen, currLen);
        }
        return maxLen;
    }
}
// @lc code=end

