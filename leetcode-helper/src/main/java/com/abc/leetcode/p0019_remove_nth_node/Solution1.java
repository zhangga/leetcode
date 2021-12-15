/**
 * Leetcode - p0019_remove_nth_node
 */
package com.abc.leetcode.p0019_remove_nth_node;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 没有元素
        if (head == null || n == 0) {
            return head;
        }

        // 找删除的前置节点
        ListNode pre = null, del = null, curr = head;
        int tail = 0;
        while (curr != null) {
            tail++;
            curr = curr.next;
            if (tail == n) {
                del = head;
            }
            else if (del != null) {
                del = del.next;
            }
            if (tail == n + 1) {
                pre = head;
            }
            else if (pre != null) {
                pre = pre.next;
            }
        }
        // del
        if (del != null) {
            if (pre == null) {
                head = del.next;
            }
            else {
                pre.next = del.next;
            }
        }
        return head;
    }

}
