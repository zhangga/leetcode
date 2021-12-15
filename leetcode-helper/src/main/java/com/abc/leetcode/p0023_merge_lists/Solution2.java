/**
 * Leetcode - p0023_merge_lists
 */
package com.abc.leetcode.p0023_merge_lists;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 小顶堆优先队列
 */
class Solution2 implements Solution {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue(lists.length, comparator);
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (ListNode node : lists) {
            if (node != null)
                queue.add(node);
        }
        while (!queue.isEmpty()) {
            ListNode min = queue.poll();
            p.next = min;
            p = p.next;
            if (min.next != null) {
                queue.add(min.next);
            }
        }
        return head.next;
    }

    private Comparator<ListNode> comparator = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    };

}
