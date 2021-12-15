/**
 * Leetcode - p0179_largest_number
 */
package com.abc.leetcode.p0179_largest_number;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    @Override
    public String largestNumber(int[] nums) {
        boolean zero = true;
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                zero = false;
            strings[i] = String.valueOf(nums[i]);
        }
        if (zero)
            return "0";
        Arrays.sort(strings, (o1, o2) -> {
            return (o1+o2).compareTo(o2+o1);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
