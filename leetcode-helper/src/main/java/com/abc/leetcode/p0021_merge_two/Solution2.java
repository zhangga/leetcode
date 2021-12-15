/**
 * Leetcode - p0021_merge_two
 */
package com.abc.leetcode.p0021_merge_two;
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
class Solution2 implements Solution {

    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode n = new ListNode(l1.val);
                node.next = n;
                node = n;
                l1 = l1.next;
            }
            else {
                ListNode n = new ListNode(l2.val);
                node.next = n;
                node = n;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            ListNode n = new ListNode(l1.val);
            node.next = n;
            node = n;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode n = new ListNode(l2.val);
            node.next = n;
            node = n;
            l2 = l2.next;
        }
        return head.next;
    }

}
