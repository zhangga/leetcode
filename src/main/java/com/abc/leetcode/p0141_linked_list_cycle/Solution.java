/**
 * Leetcode - p0141_linked_list_cycle
 */
package com.abc.leetcode.p0141_linked_list_cycle;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean hasCycle(ListNode head);
    
}
