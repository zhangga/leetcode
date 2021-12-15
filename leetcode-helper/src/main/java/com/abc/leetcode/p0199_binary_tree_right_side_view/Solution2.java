/**
 * Leetcode - p0199_binary_tree_right_side_view
 */
package com.abc.leetcode.p0199_binary_tree_right_side_view;
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
class Solution2 implements Solution {

    @Override
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        helper(root, list, 1);
        return list;
    }

    private void helper(TreeNode node, List<Integer> list, int depth) {
        if (node == null)
            return;
        if (list.size() < depth)
            list.add(node.val);
        helper(node.right, list, depth+1);
        helper(node.left, list, depth+1);
    }

}
