/**
 * Leetcode - p0023_merge_lists
 */
package com.abc.leetcode.p0023_merge_lists;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 分治法
 */
class Solution1 implements Solution {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0)
            return null;
        else if (len == 1)
            return lists[0];
        else if (len == 2)
            return mergeTwoLists(lists[0], lists[1]);
        else {
            ListNode[] list1 = new ListNode[lists.length/2];
            System.arraycopy(lists, 0, list1, 0, list1.length);
            ListNode[] list2 = new ListNode[lists.length - list1.length];
            System.arraycopy(lists, list1.length, list2, 0, list2.length);
            return mergeTwoLists(mergeKLists(list1), mergeKLists(list2));
        }
    }

    /**
     * 合并两个链表
     * @param list1
     * @param list2
     * @return
     */
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
        if (list1 != null) {
            p.next = list1;
        }
        else {
            p.next = list2;
        }
        return head.next;
    }

}
