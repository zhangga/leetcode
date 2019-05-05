/**
 * Leetcode - p0141_linked_list_cycle
 */
package com.abc.leetcode.p0141_linked_list_cycle;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * hashmap实现
 */
class Solution1 implements Solution {

    @Override
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head))
                return true;
            else
                visited.add(head);
            head = head.next;
        }
        return false;
    }

}
