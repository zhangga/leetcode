/**
 * Leetcode - p0148_sort_list
 */
package com.abc.leetcode.p0148_sort_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * 归并排序
 */
class Solution1 implements Solution {

    @Override
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head, slow = head, prev = null;
        // 快慢指针找到中点
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        // 归并排序
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(slow);

        // 合并
        return merge(list1, list2);
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            }
            else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        if (list1 != null)
            p.next = list1;
        if (list2 != null)
            p.next = list2;

        return head.next;
    }

}
