/**
 * Leetcode - p0155_min_stack
 */
package com.abc.leetcode.p0155_min_stack;
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

    private Node top = null;

    public Solution1() {

    }

    @Override
    public void push(int x) {
        if (top == null) {
            top = new Node(x, x);
        }
        else {
            int min = x < top.min ? x : top.min;
            Node next = new Node(x, min);
            next.prev = top;
            top = next;
        }
    }

    @Override
    public void pop() {
        if (top == null) {
            return;
        }
        top = top.prev;
    }

    @Override
    public int top() {
        if (top == null)
            return 0;
        return top.val;
    }

    @Override
    public int getMin() {
        if (top == null)
            return 0;
        return top.min;
    }

    private class Node {
        public int val, min;
        public Node prev;
        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}
