/**
 * Leetcode - p0018_4sum
 */
package com.abc.leetcode.p0018_4sum;
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
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return res;

        // 排序数组
        Arrays.sort(nums);
        int len = nums.length;
        int max = nums[len - 1];

        if (4 * nums[0] > target || 4 * max < target)
            return res;

        int left;
        for (int i = 0; i < len; i++) {
            left = nums[i];
            if (i > 0 && left == nums[i-1])     // avoid duplicate
                continue;
            if (left + 3 * max < target)    // left is too small
                continue;
            if (4 * left > target)          // left is too large
                continue;
            if (4 * left == target) {       // left is the boundary
                if (i + 3 < len && nums[i + 3] == left)
                    res.add(Arrays.asList(left, left, left, left));
                break;
            }

            threeSumForFourSum(nums, target-left, i+1, len-1, res, left);
        }

        return res;
    }

    public void threeSumForFourSum(int[] nums, int target, int low, int high, List<List<Integer>> fourSumList, int left1) {
        if (low + 1 >= high)
            return;
        int max = nums[high];
        if (3 * nums[low] > target || 3 * max < target)
            return;

        int left;
        for (int i = low; i < high-1; i++) {
            left = nums[i];
            if (i > low && left == nums[i-1])
                continue;
            if (left + 2*max < target)
                continue;
            if (3 * left > target)
                continue;
            if (3 * left == target) {
                if (i + 1 < high && nums[i+2] == left)
                    fourSumList.add(Arrays.asList(left1, left, left, left));
                break;
            }

            twoSumForFourSum(nums, target-left, i+1, high, fourSumList, left1, left);
        }
    }

    public void twoSumForFourSum(int[] nums, int target, int low, int high, List<List<Integer>> fourSumList, int left1, int left2) {
        if (low >= high)
            return;
        int max = nums[high];
        if (2 * nums[low] > target || 2 * max < target)
            return;

        int sum, x;
        while (low < high) {
            sum = nums[low] + nums[high];
            if (sum == target) {
                fourSumList.add(Arrays.asList(left1, left2, nums[low], nums[high]));

                x = nums[low];
                while (++low < high && nums[low] == x);
                x = nums[high];
                while (--high > low && nums[high] == x);
            }
            if (sum < target)
                low++;
            if (sum > target)
                high--;
        }
        return;
    }

}
