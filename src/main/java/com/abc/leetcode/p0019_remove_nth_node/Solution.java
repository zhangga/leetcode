/**
 * Leetcode - p0019_remove_nth_node
 */
package com.abc.leetcode.p0019_remove_nth_node;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode removeNthFromEnd(ListNode head, int n);
    
}
