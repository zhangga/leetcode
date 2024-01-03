/*
 * @lc app=leetcode.cn id=2487 lang=java
 *
 * [2487] 从链表中移除节点
 */

// @lc code=start

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        ListNode ret = null;

        while (node != null) {
            while (!stack.empty()) {
                if (stack.peek().val < node.val) {
                    stack.pop();
                } else {
                    break;
                }
            }
            if (stack.empty()) {
                ret = node;
            } else {
                stack.peek().next = node;
            }
            stack.push(node);
            node = node.next;
        }

        return ret;
    }
}
// @lc code=end

