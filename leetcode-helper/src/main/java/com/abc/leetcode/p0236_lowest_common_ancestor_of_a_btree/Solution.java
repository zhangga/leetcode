/**
 * Leetcode - p0236_lowest_common_ancestor_of_a_btree
 */
package com.abc.leetcode.p0236_lowest_common_ancestor_of_a_btree;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);
    
}
