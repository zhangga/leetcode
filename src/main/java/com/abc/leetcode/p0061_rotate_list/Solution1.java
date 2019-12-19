/**
 * Leetcode - p0061_rotate_list
 */
package com.abc.leetcode.p0061_rotate_list;
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
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode node = head;
        ListNode tail = null;
        while (node != null) {
            len++;
            tail = node;
            node = node.next;
        }
        if (len == 0)
            return head;
        k = k % len;
        if (k == 0)
            return head;
        node = head;
        for (int i = 0; i < len - 1 - k; i++) {
            node = node.next;
        }
        ListNode next = node.next;
        node.next = null;
        tail.next = head;
        return next;
    }

}
