/**
 * Leetcode - p0230_kth_smallest_element_in_a_bst
 */
package com.abc.leetcode.p0230_kth_smallest_element_in_a_bst;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 中序遍历，非递归，栈
 */
class Solution2 implements Solution {

    @Override
    public int kthSmallest(TreeNode root, int k) {
        return inOrder(root, k);
    }

    // 中序遍历，非递归，栈
    private int inOrder(TreeNode root, int k) {
        int n = 0;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            }
            else {
                TreeNode node = stack.pop();
                if (++n == k) {
                    return node.val;
                }
                pNode = node.right;
            }
        }
        return 0;
    }

}
