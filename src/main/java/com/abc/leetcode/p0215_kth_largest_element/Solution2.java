/**
 * Leetcode - p0215_kth_largest_element
 */
package com.abc.leetcode.p0215_kth_largest_element;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 堆
 * 只能存K个数字的最小顶堆，超过K时候，每加进一个来，堆顶就弹出一个。
 * 数组遍历完，最顶堆的元素就是第K大的，堆里其他元素都比他大。
 */
class Solution2 implements Solution {

    @Override
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> {
            return n1 - n2;
        });
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        return heap.poll();
    }

}
