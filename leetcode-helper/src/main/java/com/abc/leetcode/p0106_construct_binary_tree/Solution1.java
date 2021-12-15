/**
 * Leetcode - p0106_construct_binary_tree
 */
package com.abc.leetcode.p0106_construct_binary_tree;
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

    int postIndex = 0;
    HashMap<Integer, Integer> indexs = null;

    @Override
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        indexs = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexs.put(inorder[i], i);
        }
        postIndex = postorder.length-1;
        return helper(inorder, postorder, 0, postorder.length-1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int pstart, int pend) {
        if (pstart > pend || postIndex < 0)
            return null;
        int idx = indexs.get(postorder[postIndex]);
        TreeNode root = new TreeNode(postorder[postIndex--]);
        root.right = helper(inorder, postorder, idx+1, pend);
        root.left = helper(inorder, postorder, pstart, idx-1);
        return root;
    }

}
