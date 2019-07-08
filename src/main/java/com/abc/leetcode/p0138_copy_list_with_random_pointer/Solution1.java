/**
 * Leetcode - p0138_copy_list_with_random_pointer
 */
package com.abc.leetcode.p0138_copy_list_with_random_pointer;

/** 
 * 深拷贝带随机节点的链表
 */
class Solution1 {

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node oldNext = null, curr = head;
        // 将原链表：A->B->C
        // 变为：A->A`->B->B`->C->C`
        while (curr != null) {
            oldNext = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = oldNext;
            curr = oldNext;
        }

        // 深拷贝random
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // 将A->A`->B->B`->C->C`变为最终要的A`->B`->C`
        Node oldHead = head, newHead = head.next, result = head.next;
        while (oldHead != null) {
            oldHead.next = oldHead.next.next;
            oldHead = oldHead.next;
            if (oldHead != null) {
                newHead.next = newHead.next.next;
                newHead = newHead.next;
            }
        }
        return result;
    }

}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
