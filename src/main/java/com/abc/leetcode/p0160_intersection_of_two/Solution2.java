/**
 * Leetcode - p0160_intersection_of_two
 */
package com.abc.leetcode.p0160_intersection_of_two;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 双指针法：https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/tu-jie-xiang-jiao-lian-biao-by-user7208t/
 * 没有交点时相交于最后的null
 */
class Solution2 implements Solution {

    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
