/**
 * Leetcode - p0295_find_median_from_data
 */
package com.abc.leetcode.p0295_find_median_from_data;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 添加数据时进行插入排序
 */
class Solution2 extends Solution {

    private double[] nums = null;
    private int size = 0;

    public Solution2() {
        nums = new double[8];
    }

    @Override
    public void addNum(int num) {
        if (size >= nums.length) {
            double[] array = new double[size<<2];
            System.arraycopy(this.nums, 0, array, 0, size);
            this.nums = array;
        }
        // 插入排序
        int i = 0;
        while (i < size) {
            if (this.nums[i] >= num) {
                break;
            }
            i++;
        }
        if (i < size) {
            System.arraycopy(this.nums, i, this.nums, i+1, size-i);
        }
        this.nums[i] = num;
        size++;
    }

    @Override
    public double findMedian() {
        return size % 2 == 0 ? (this.nums[size/2-1] + this.nums[size/2]) * 0.5 : this.nums[size/2];
    }
}
