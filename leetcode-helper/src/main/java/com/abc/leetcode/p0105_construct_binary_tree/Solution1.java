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
class Solution1 implements Solution {

    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildWithInorderAndPreorder(0, 0, inorder.length-1, preorder, inorder);
    }

    private TreeNode buildWithInorderAndPreorder(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length-1 || inStart > inEnd)
            return null;
        int value = preorder[preStart];
        TreeNode root = new TreeNode(value);
        int inIndex = getIndex(value, inorder);
        // 左子树
        root.left = buildWithInorderAndPreorder(preStart+1, inStart, inIndex-1, preorder, inorder);
        // 右子树
        root.right = buildWithInorderAndPreorder(preStart+inIndex-inStart+1, inIndex+1, inEnd, preorder, inorder);
        return root;
    }

    /**
     * 查找一个值在中序遍历中的索引
     * @param value
     * @param order
     * @return
     */
    private int getIndex(int value, int[] order) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == value)
                return i;
        }
        return -1;
    }

}
