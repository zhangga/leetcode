/**
 * Leetcode - p0219_contains_duplicate_ii
 */
package com.abc.leetcode.p0219_contains_duplicate_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 散列表搜索
 */
class Solution2 implements Solution {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, i);
            }
            else {
                int lastIndex = map.get(num);
                map.put(num, i);
                if (i - lastIndex <= k) {
                    return true;
                }
            }
        }
        return false;
    }

}
