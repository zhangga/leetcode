/**
 * Leetcode - p0104_maximum_depth_of_binary_tree
 */
package com.abc.leetcode.p0104_maximum_depth_of_binary_tree;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    @Override
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        // leaf node
        if (root.left == null && root.right == null)
            return 1;
        else if (root.left == null)
            return maxDepth(root.right) + 1;
        else if (root.right == null)
            return maxDepth(root.left) + 1;
        else
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
