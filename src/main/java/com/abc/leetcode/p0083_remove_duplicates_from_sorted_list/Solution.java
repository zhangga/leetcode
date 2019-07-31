/**
 * Leetcode - p0083_remove_duplicates_from_sorted_list
 */
package com.abc.leetcode.p0083_remove_duplicates_from_sorted_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode deleteDuplicates(ListNode head);
    
}
