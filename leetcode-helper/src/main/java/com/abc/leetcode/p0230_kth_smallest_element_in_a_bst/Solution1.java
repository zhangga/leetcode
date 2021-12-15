/**
 * Leetcode - p0230_kth_smallest_element_in_a_bst
 */
package com.abc.leetcode.p0230_kth_smallest_element_in_a_bst;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 中序遍历，递归
 */
class Solution1 implements Solution {

    private int n = 0;
    private int k = 0;
    private Integer v = null;

    @Override
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return v;
    }

    // 中序遍历，递归
    private void inOrder(TreeNode root) {
        if (this.v != null)
            return;
        if (root != null) {
            inOrder(root.left);
            if (++n == k) {
                this.v = root.val;
                return;
            }
            inOrder(root.right);
        }
    }

}
