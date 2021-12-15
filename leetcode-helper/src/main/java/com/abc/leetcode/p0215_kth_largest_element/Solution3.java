package com.abc.leetcode.p0215_kth_largest_element;

/**
 * 快速选择法
 * Created by U-Demon
 * Date: 2019/9/2
 */
public class Solution3 implements Solution {

    @Override
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length-1, k-1);
    }

    private int findKthLargest(int[] nums, int low, int high, int k) {
        int index = partition(nums, low, high);
        if (index == k)
            return nums[index];
        else if (index > k)
            return findKthLargest(nums, low, index-1, k);
        else
            return findKthLargest(nums, index+1, high, k);
    }

    private int partition(int[] nums, int low, int high) {
        // 类似快速排序的方式，确定一个pivot为这个中位数的值x[l]，然后小的数放左边，大的数放右边
        // 填坑法，最开始的数字x[l]上l位置是空出来的，避免了交换
        // 那么每一轮都从右边位置j找到一个较小的数填到i上（最开始i=l)，然后i上空出来了位置，
        // 就再从左侧开始找到一个较大的数填回j上，直到i>=j
        int pivot = nums[low];
        // 从大到小排序
        while (low < high) {
            while (low < high && nums[high] <= pivot) {
                high--;
            }
            if (low < high) {
                nums[low] = nums[high];
            }
            while (low < high && nums[low] >= pivot) {
                low++;
            }
            if (low < high) {
                nums[high] = nums[low];
            }
        }
        nums[low] = pivot;
        return low;
    }

}
