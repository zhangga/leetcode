/**
 * Leetcode - p0105_construct_binary_tree
 */
package com.abc.leetcode.p0105_construct_binary_tree;
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

    private Map<Integer, Integer> indexs;
    private int pStart = 0;

    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;
        indexs = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexs.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, preorder.length-1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int pstart, int pend) {
        if (pstart > pend || pStart >= preorder.length)
            return null;
        int idx = indexs.get(preorder[pStart]);
        TreeNode root = new TreeNode(preorder[pStart]);
        pStart++;
        root.left = helper(preorder, inorder, pstart, idx-1);
        root.right = helper(preorder, inorder, idx+1, pend);
        return root;
    }

}
