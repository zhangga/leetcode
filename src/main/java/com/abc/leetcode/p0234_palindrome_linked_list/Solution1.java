/**
 * Leetcode - p0234_palindrome_linked_list
 */
package com.abc.leetcode.p0234_palindrome_linked_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 快慢指针
 */
class Solution1 implements Solution {

    @Override
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head.next;
        ListNode fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 反转链表前半部分
        ListNode pre = null;
        ListNode next = null;
        while (head != slow) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        // 如果是奇数个节点，去掉后半部分的第一个节点。
        if (fast != null) {
            slow = slow.next;
        }

        while (pre != null) {
            if (pre.val != slow.val)
                return false;
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }

}
