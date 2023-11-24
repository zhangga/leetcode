/*
 * @lc app=leetcode.cn id=2824 lang=java
 *
 * [2824] 统计和小于目标的下标对数目
 */

// @lc code=start

import java.util.Collections;
import java.util.List;

class Solution {
    // -1 1 1 2 3
    public int countPairs(List<Integer> nums, int target) {
        if (nums.size() <= 1) {
            return 0;
        }
        Collections.sort(nums);
        int count = 0;
        int i = 0, j = nums.size()-1;
        while (i < j) {
            if (nums.get(i) + nums.get(j) >= target) {
                j--;
                continue;
            }
            count+=(j-i);
            i++;
        }
        return count;
    }
}
// @lc code=end

