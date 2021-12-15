/**
 * Leetcode - p0230_kth_smallest_element_in_a_bst
 */
package com.abc.leetcode.p0230_kth_smallest_element_in_a_bst;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int kthSmallest(TreeNode root, int k);
    
}
