/**
 * Leetcode - p0061_rotate_list
 */
package com.abc.leetcode.p0061_rotate_list;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode rotateRight(ListNode head, int k);

}
