/**
 * Leetcode - p0160_intersection_of_two
 */
package com.abc.leetcode.p0160_intersection_of_two;
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> existA = new HashSet<>();
        ListNode next = headA;
        while (next != null) {
            existA.add(next);
            next = next.next;
        }
        next = headB;
        while (next != null) {
            if (existA.contains(next)) {
                return next;
            }
            next = next.next;
        }
        return null;
    }

}
