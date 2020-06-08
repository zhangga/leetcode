/**
 * Leetcode - p0024_swap_nodes
 */
package com.abc.leetcode.p0024_swap_nodes;
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = head.next;
        ListNode pre = null;
        ListNode node = head;
        ListNode next = node.next;
        while (node != null && next != null) {
            if (pre != null)
                pre.next = next;
            pre = node;
            node.next = next.next;
            next.next = node;
            node = node.next;
            if (node != null)
                next = node.next;
        }
        return newHead;
    }

}
