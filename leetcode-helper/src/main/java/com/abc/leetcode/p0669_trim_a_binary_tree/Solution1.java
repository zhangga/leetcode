/**
 * Leetcode - p0669_trim_a_binary_tree
 */
package com.abc.leetcode.p0669_trim_a_binary_tree;
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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        // 节点的值比L小
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        // 节点的值比R大
        else if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        else {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return  root;
        }
    }

}
