/**
 * Leetcode - p0160_intersection_of_two
 */
package com.abc.leetcode.p0160_intersection_of_two;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode getIntersectionNode(ListNode headA, ListNode headB);
    
}
