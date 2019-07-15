/**
 * Leetcode - p0324_wiggle_sort_ii
 */
package com.abc.leetcode.p0324_wiggle_sort_ii;
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
    public void wiggleSort(int[] nums) {
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int len = nums.length;
        int middle_or_left = (len+1)/2-1;
        int tail = len-1;
        for (int i = 0; i < len; ++i) {
            if (i % 2 == 0) {
                nums[i] = tmp[middle_or_left];
                middle_or_left--;
            }
            else {
                nums[i] = tmp[tail];
                tail--;
            }
        }
    }
}
