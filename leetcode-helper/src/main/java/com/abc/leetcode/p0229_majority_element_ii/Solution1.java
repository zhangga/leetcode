/**
 * Leetcode - p0229_majority_element_ii
 */
package com.abc.leetcode.p0229_majority_element_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 多数投票法
 */
class Solution1 implements Solution {

    @Override
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        int major_a = nums[0];
        int count_a = 0;
        int major_b = nums[0];
        int count_b = 0;
        for (int num : nums) {
            if (num == major_a) {
                count_a++;
            }
            else if (num == major_b) {
                count_b++;
            }
            else if (count_a == 0) {
                major_a = num;
                count_a++;
            }
            else if (count_b == 0) {
                major_b = num;
                count_b++;
            }
            else {
                count_a--;
                count_b--;
            }
        }
        List<Integer> list = new ArrayList<>();
        count_a = count_b = 0;
        for (int num: nums) {
            if (num == major_a)
                count_a++;
            else if (num == major_b)
                count_b++;
        }
        if (count_a > nums.length / 3)
            list.add(major_a);
        if (count_b > nums.length / 3)
            list.add(major_b);
        return list;
    }

}
