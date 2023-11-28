/*
 * @lc app=leetcode.cn id=1670 lang=java
 *
 * [1670] 设计前中后队列
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class FrontMiddleBackQueue {

    private Deque<Integer> left;
    private Deque<Integer> right;

    public FrontMiddleBackQueue() {
        this.left = new ArrayDeque<Integer>();
        this.right = new ArrayDeque<Integer>();
    }
    
    public void pushFront(int val) {
        this.left.offerFirst(val);
        if (left.size() == right.size() + 2) {
            right.offerFirst(left.pollLast());
        }
    }
    
    public void pushMiddle(int val) {
        if (left.size() == right.size() + 1) {
            right.offerFirst(left.pollLast());
        }
        left.offerLast(val);
    }
    
    public void pushBack(int val) {
        right.offerLast(val);
        if (left.size() + 1 == right.size()) {
            left.offerLast(right.pollFirst());
        }
    }
    
    public int popFront() {
        if (left.isEmpty()) {
            return -1;
        }
        int val = left.pollFirst();
        if (left.size() + 1 == right.size()) {
            left.offerLast(right.pollFirst());
        }
        return val;
    }
    
    public int popMiddle() {
        if (left.isEmpty()) {
            return -1;
        }
        int val = left.pollLast();
        if (left.size() + 1 == right.size()) {
            left.offerLast(right.pollFirst());
        }
        return val;
    }
    
    public int popBack() {
        if (left.isEmpty()) {
            return -1;
        }
        int val = 0;
        if (right.isEmpty()) {
            val = left.pollLast();
        } else {
            val = right.pollLast();
            if (left.size() == right.size() + 2) {
                right.offerFirst(left.pollLast());
            }
        }
        return val;
    }

    public class Node {
        public int val;
        public Node prev;
        public Node next;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }
        
        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
// @lc code=end

