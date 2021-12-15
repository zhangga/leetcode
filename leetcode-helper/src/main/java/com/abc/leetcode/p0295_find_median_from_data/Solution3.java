package com.abc.leetcode.p0295_find_median_from_data;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 两个堆
 * Created by U-Demon
 * Date: 2019/9/16
 */
public class Solution3 extends Solution {

    // 较小部分的最大堆
    private PriorityQueue<Integer> minQueue = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    // 较大部分的最小堆
    private PriorityQueue<Integer> maxQueue = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    });

    @Override
    public void addNum(int num) {
        // 加入对应的堆
        if (this.minQueue.size() == 0) {
            this.minQueue.add(num);
        }
        else if (num <= this.minQueue.peek()) {
            this.minQueue.add(num);
        }
        else {
            this.maxQueue.add(num);
        }

        // 平衡堆
        if (this.minQueue.size() > this.maxQueue.size() + 1) {
            this.maxQueue.add(this.minQueue.poll());
        }
        else if (this.maxQueue.size() > this.minQueue.size() + 1) {
            this.minQueue.add(this.maxQueue.poll());
        }
    }

    @Override
    public double findMedian() {
        int minSize = this.minQueue.size();
        int maxSize = this.maxQueue.size();
        if (minSize == maxSize) {
            return (this.minQueue.peek() + this.maxQueue.peek()) * 0.5;
        }
        else if (minSize > maxSize) {
            return this.minQueue.peek();
        }
        else {
            return this.maxQueue.peek();
        }
    }

}
