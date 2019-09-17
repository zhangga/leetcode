/**
 * Leetcode - p0239_sliding_window_maximum
 */
package com.abc.leetcode.p0239_sliding_window_maximum;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 双端队列
 */
class Solution2 implements Solution {

    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int[] arr = new int[nums.length-k+1];
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0, index = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] < nums[i]) {
                list.pollLast();
            }
            list.addLast(i);
            if (list.peekFirst() == i-k) {
                list.pollFirst();
            }
            if (i >= k-1) {
                arr[index++] = nums[list.peekFirst()];
            }
        }
        return arr;
    }

}
