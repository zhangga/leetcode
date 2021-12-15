/**
 * Leetcode - p0100_same_tree
 */
package com.abc.leetcode.p0100_same_tree;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean isSameTree(TreeNode p, TreeNode q);

}
