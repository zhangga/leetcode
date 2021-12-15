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
class Solution2 implements Solution {

    @Override
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strs = new String[n];
        for (int i = 0; i < n; ++i) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new NumComparator());
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        String tmp = sb.toString();
        int idx = 0;
        while (idx < tmp.length() && tmp.charAt(idx) == '0') {
            ++idx;
        }
        if (idx == tmp.length()) {
            return "0";
        } else {
            return tmp.substring(idx);
        }
    }

    private class NumComparator implements Comparator<String> {
        public int compare(String a, String b) {
            return (b + a).compareTo(a + b);
        }
    }
}
