/**
 * Leetcode - p0141_linked_list_cycle
 */
package com.abc.leetcode.p0141_linked_list_cycle;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 快慢指针
 * 有环的时候快指针会在环处打转，总会碰见的。
 * 延伸问题：
 * 1.一趟遍历找到链表的中间元素 fast = 2 * slow
 * 2.一趟遍历找到链表中倒数第K个节点的值 先让fast走K-1步，然后一起走。
 */
class Solution2 implements Solution {

    @Override
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

}
