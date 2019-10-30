/**
 * Leetcode - p0147_insertion_sort_list
 */
package com.abc.leetcode.p0147_insertion_sort_list;
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

    @Override
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = new ListNode(0);
        first.next = head;
        ListNode pre = first;
        ListNode curr = head;
        ListNode last;
        while (curr != null) {
            last = curr.next;
            if (last != null && last.val < curr.val) {
                while (pre.next != null && pre.next.val < last.val) {
                    pre = pre.next;
                }
                // 找到要插入的位置
                ListNode temp = pre.next;
                pre.next = last;
                curr.next = last.next;
                last.next = temp;
                pre = first;
            }
            else {
                curr = last;
            }
        }
        return first.next;
    }

}
