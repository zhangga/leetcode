/**
 * Leetcode - p0148_sort_list
 */
package com.abc.leetcode.p0148_sort_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/**
 * @see Solution1 其实并不是0(1) space，因为使用了递归的归并排序，需要Log(N)的递归堆栈调用。
 * 这是正在的O(1) space的解，其实就是把递归变为自底向上的归并排序，非常类似动态规划的思想，
 * 自顶向下是递归，自底向上也就是动态规划。
 */
class Solution2 implements Solution {

    @Override
    public ListNode sortList(ListNode head) {
        int step = 1;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        int size = getSize(head);
        while (step < size) {
            dummyHead.next = splitAndMergeAtK(dummyHead.next, step);
            step *= 2;
        }
        return dummyHead.next;
    }

    private ListNode splitAndMergeAtK(ListNode head, int K) {
        // iterative merge for every 2 size K segment,
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (head != null) {
            ListNode[] headTail1 = getK(head, K); // Get a segment of size K
            head = headTail1[1].next;
            headTail1[1].next = null;
            if (head == null) {
                cur.next = headTail1[0];
                return dummyHead.next;
            }
            ListNode[] headTail2 = getK(head, K); // Get another segment of size K

            head = headTail2[1].next;
            headTail2[1].next = null;
            ListNode[] mergedHeadTail =  mergeK(headTail1[0], headTail2[0]); //merge two segments
            cur.next = mergedHeadTail[0]; // hook up
            cur = mergedHeadTail[1];
        }
        return dummyHead.next;
    }

    private ListNode[] getK(ListNode head, int K) { // get a segment of size K
        ListNode[] ans = new ListNode[2]; //head must not be null;
        ans[0] = head;
        for (int i = 0; i < K; i++) {
            ans[1] = head;
            head = head.next;
            if (head == null) break;
        }
        return ans;
    }

    private ListNode[] mergeK(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                cur.next = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
            cur.next = null;
        }
        cur.next = head1 != null ? head1 : head2;
        while (cur.next != null) {
            cur = cur.next;
        }
        return new ListNode[]{dummyHead.next, cur};
    }

    private int getSize(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

}
