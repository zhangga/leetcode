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
class Solution2 implements Solution {

    @Override
    public ListNode swapPairs(ListNode head) {
        ListNode thead = new ListNode(-1);
        ListNode s, a, b;
        thead.next = head;
        s = thead;
        while (s.next != null && s.next.next != null) {
            a = s.next;
            b = a.next;
            s.next = b;
            a.next = b.next;
            b.next = a;
            s = a;
        }
        return thead.next;
    }

}
