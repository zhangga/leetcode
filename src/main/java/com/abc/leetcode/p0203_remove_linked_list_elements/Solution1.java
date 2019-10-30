/**
 * Leetcode - p0203_remove_linked_list_elements
 */
package com.abc.leetcode.p0203_remove_linked_list_elements;
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode(0);
        first.next = head;

        ListNode pre = first;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            }
            else {
                pre = head;
            }
            head = head.next;
        }
        return first.next;
    }

}
