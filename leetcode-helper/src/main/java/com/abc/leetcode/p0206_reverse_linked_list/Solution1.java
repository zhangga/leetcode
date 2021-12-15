/**
 * Leetcode - p0206_reverse_linked_list
 */
package com.abc.leetcode.p0206_reverse_linked_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 反转链表
 */
class Solution1 implements Solution {

    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
