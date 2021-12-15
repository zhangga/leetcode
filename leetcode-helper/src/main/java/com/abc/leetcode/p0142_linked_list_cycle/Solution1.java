/**
 * Leetcode - p0142_linked_list_cycle
 */
package com.abc.leetcode.p0142_linked_list_cycle;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 第一趟与141题一样，先用快慢指针判断是否有环，
 * 若有环，当快指针与慢指针在Z处相遇，慢指针走了 a+b ，快指针走了 a 然后绕了 n 圈 (n>=1) 后又走了 b ，
 * 所以有 2(a+b)=a+b+n(b+c) ，整理得 a=c+(n-1)(b+c) ，
 * 于是令fast回到head，快慢指针以相同速度走，fast走了 a 到Y，slow恰好走了 c 加 n-1 圈回到Y处，此处即为入环的第一个节点。
 */
class Solution1 implements Solution {

    @Override
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast != slow) {
            return null;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
