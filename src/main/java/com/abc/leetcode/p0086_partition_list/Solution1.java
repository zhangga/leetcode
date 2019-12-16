/**
 * Leetcode - p0086_partition_list
 */
package com.abc.leetcode.p0086_partition_list;
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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode more = new ListNode(-1);
        ListNode moreHead = more;
        ListNode less = new ListNode(-1);
        ListNode lessHead = less;
        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            }
            else {
                more.next = head;
                more = more.next;
            }
            head = head.next;
        }
        more.next = null;
        less.next = moreHead.next;
        return lessHead.next;
    }

}
