/**
 * Leetcode - p0143_reorder_list
 */
package com.abc.leetcode.p0143_reorder_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/**
 * 总体思想是：
 * 1.找出链表的中间节点；
 * 2.将链表截断，后半部分的链表翻转；
 * 3.将前半段与翻转的后半段按题目要求翻转
 */
class Solution1 implements Solution {

    @Override
    public void reorderList(ListNode head) {
        // 快指针
        ListNode fast = head;
        // 慢指针
        ListNode slow = head;
        // 中间节点的前一个
        ListNode pre = null;
        // 找出中间节点
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != null && pre != null) {
            // 把链表从中间节点分开
            pre.next = null;
            // 预留遍历循环中的前一个节点
            ListNode p = null;
            // 后半段节点反转
            while (slow != null) {
                ListNode next = slow.next;
                slow.next = p;
                p = slow;
                slow = next;
            }
            // 定义一个指针重新从头开始
            ListNode restart = head;
            // 依次将后半段节点放到前半段节点后面
            while (restart != null) {
                ListNode pNext = p.next;
                ListNode rNext = restart.next;
                if (restart.next != null) {
                    p.next = restart.next;
                }
                restart.next = p;
                p = pNext;
                restart = rNext;
            }
        }
    }

}
