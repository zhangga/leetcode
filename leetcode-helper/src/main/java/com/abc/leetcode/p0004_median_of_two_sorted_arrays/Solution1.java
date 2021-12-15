/**
 * Leetcode - p0004_median_of_two_sorted_arrays
 */
package com.abc.leetcode.p0004_median_of_two_sorted_arrays;
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
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0, pos = 0;
        int ls1 = nums1.length, ls2 = nums2.length;
        int[] all_nums = new int[ls1+ls2];
        // 合并两个已排序好的数组。归并排序一个套路
        while (p1 < ls1 && p2 < ls2) {
            if (nums1[p1] <= nums2[p2])
                all_nums[pos++] = nums1[p1++];
            else
                all_nums[pos++] = nums2[p2++];
        }
        while (p1 < ls1)
            all_nums[pos++] = nums1[p1++];
        while (p2 < ls2)
            all_nums[pos++] = nums2[p2++];

        double median = 0;
        if ((ls1 + ls2) % 2 == 1)
            median = all_nums[(ls1+ls2) / 2];
        else
            median = (all_nums[(ls1+ls2) / 2] + all_nums[(ls1+ls2) / 2 - 1]) / 2.0;
        return median;
    }

}
