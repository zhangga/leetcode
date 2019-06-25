/**
 * Leetcode - p0138_copy_list_with_random_pointer
 */
package com.abc.leetcode.p0138_copy_list_with_random_pointer;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public Node copyRandomList(Node head);

}
