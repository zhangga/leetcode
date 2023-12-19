/*
 * @lc app=leetcode.cn id=1901 lang=java
 *
 * [1901] 寻找峰值 II
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        Stack<Integer> stack = new Stack<>();
        stack.push((0<<16) | 0);
        
        while (!stack.empty()) {
            int index = stack.pop();
            int i = index >> 16;
            int j = index & 0x0000ffff;
            int value = mat[i][j];
            boolean find = true;
            // left
            if (j - 1 >= 0 && value < mat[i][j-1]) {
                stack.push((i<<16) | (j-1));
                find = false;
            }
            // right
            if (j + 1 < mat[i].length && value < mat[i][j+1]) {
                stack.push((i<<16) | (j+1));
                find = false;
            }
            // up
            if (i - 1 >= 0 && value < mat[i-1][j]) {
                stack.push(((i-1)<<16) | j);
                find = false;
            }
            // down
            if (i + 1 < mat.length && value < mat[i+1][j]) {
                stack.push(((i+1)<<16) | j);
                find = false;
            }
            if (find) {
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
// @lc code=end

