/**
 * Leetcode - p0203_remove_linked_list_elements
 */
package com.abc.leetcode.p0203_remove_linked_list_elements;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode removeElements(ListNode head, int val);
    
}
