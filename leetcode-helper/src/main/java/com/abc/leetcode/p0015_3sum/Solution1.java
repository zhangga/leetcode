/**
 * Leetcode - p0015_3sum
 */
package com.abc.leetcode.p0015_3sum;
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
    public List<List<Integer>> threeSum(int[] nums) {
        // 先排序数组。java自带的排序。
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int mid, right;
        // a+b+c=0，abc为排序的数组，所以a不能大于0
        for (int left = 0; left < nums.length && nums[left] <= 0; left++) {
            // 跳过left重复匹配
            if (left > 0 && nums[left] == nums[left-1])
                continue;
            mid = left+1;
            right = nums.length-1;
            int temp = 0 - nums[left];
            while (mid < right) {
                if (nums[mid] + nums[right] == temp) {
                    list.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    // 跳过right和mid的重复匹配
                    // 去重，利用了数组的有序性，相同的两个数在数组中一定是相邻的，因此只需在遍历a时和移动指针时跳过相同的数，那么就不会有重复的三元组了。
                    int tmp_mid = nums[mid],tmp_right= nums[right];
                    while(mid < right && nums[++mid] == tmp_mid);
                    while(mid < right && nums[--right] == tmp_right);
                }
                else if (nums[mid] + nums[right] < temp) {
                    mid++;
                }
                else {
                    right--;
                }
            }
        }
        return list;
    }

}
