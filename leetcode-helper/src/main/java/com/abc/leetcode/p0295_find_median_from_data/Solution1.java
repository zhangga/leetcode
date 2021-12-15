/**
 * Leetcode - p0295_find_median_from_data
 */
package com.abc.leetcode.p0295_find_median_from_data;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 获取中位数时排序
 * 从最简单的一步一步来，查找时排序，超时
 */
class Solution1 extends Solution {

    private double[] nums = null;
    private int size = 0;

    public Solution1() {
        nums = new double[8];
    }

    @Override
    public void addNum(int num) {
        if (size >= nums.length) {
            double[] array = new double[size<<2];
            System.arraycopy(this.nums, 0, array, 0, size);
            this.nums = array;
        }
        this.nums[size++] = num;
    }

    @Override
    public double findMedian() {
        Arrays.sort(this.nums, 0, size);
        if (size % 2 == 0) {
            double sum = this.nums[size/2-1] + this.nums[size/2];
            return sum * 0.5;
        }
        else {
            return this.nums[size/2];
        }
    }

}
