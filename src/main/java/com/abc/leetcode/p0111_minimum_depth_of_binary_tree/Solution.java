/**
 * Leetcode - p0111_minimum_depth_of_binary_tree
 */
package com.abc.leetcode.p0111_minimum_depth_of_binary_tree;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int minDepth(TreeNode root);
    
}
