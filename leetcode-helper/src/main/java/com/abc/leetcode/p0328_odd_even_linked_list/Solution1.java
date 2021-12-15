/**
 * Leetcode - p0328_odd_even_linked_list
 */
package com.abc.leetcode.p0328_odd_even_linked_list;
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode evenHead = head.next;
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        while (evenNode != null && evenNode.next != null) {
            oddNode.next = evenNode.next;
            evenNode.next = evenNode.next.next;
            oddNode = oddNode.next;
            evenNode = evenNode.next;
        }

        oddNode.next = evenHead;
        return head;
    }

}
