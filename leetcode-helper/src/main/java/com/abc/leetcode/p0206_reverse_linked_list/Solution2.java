/**
 * Leetcode - p0206_reverse_linked_list
 */
package com.abc.leetcode.p0206_reverse_linked_list;
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode node = reverseList(head.next);
        ListNode next = head.next;
        next.next = head;
        head.next = null;
        return node;
    }

}
