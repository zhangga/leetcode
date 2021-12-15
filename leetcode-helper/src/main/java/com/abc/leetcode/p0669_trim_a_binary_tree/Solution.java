/**
 * Leetcode - p0669_trim_a_binary_tree
 */
package com.abc.leetcode.p0669_trim_a_binary_tree;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public TreeNode trimBST(TreeNode root, int L, int R);
    
}
