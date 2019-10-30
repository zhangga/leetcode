/**
 * Leetcode - p0236_lowest_common_ancestor_of_a_btree
 */
package com.abc.leetcode.p0236_lowest_common_ancestor_of_a_btree;
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

    private TreeNode ans;

    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.recurseTree(root, p, q);
        return this.ans;
    }

    private boolean recurseTree(TreeNode currNode, TreeNode p, TreeNode q) {
        if (currNode == null) {
            return false;
        }
        int left = this.recurseTree(currNode.left, p, q) ? 1 : 0;
        int right = this.recurseTree(currNode.right, p, q) ? 1 : 0;
        int mid = (currNode == p || currNode == q) ? 1 : 0;
        if (mid + left + right >= 2) {
            this.ans = currNode;
        }
        return mid + left + right > 0;
    }

}
