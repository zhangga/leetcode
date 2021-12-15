/**
 * Leetcode - p0349_intersection_of_two_arrays
 */
package com.abc.leetcode.p0349_intersection_of_two_arrays;
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
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ret = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
        int i = 0;
        int j = 0;
        int index = -1;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (index == -1 || ret[index] != nums1[i]) {
                    ret[++index] = nums1[i];
                }
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        int[] result = new int[index+1];
        System.arraycopy(ret, 0, result, 0, index+1);
        return result;
    }

}
