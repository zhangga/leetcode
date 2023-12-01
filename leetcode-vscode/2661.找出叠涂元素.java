/*
 * @lc app=leetcode.cn id=2661 lang=java
 *
 * [2661] 找出叠涂元素
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        if (row == 1 || col == 1) {
            return 0;
        }

        // mat中每个数字所在的下标
        int[] index = new int[arr.length+1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int idx = i * col + j;
                index[mat[i][j]] = idx;
            }
        }

        Map<Integer, Integer> rowColored = new HashMap<>();
        Map<Integer, Integer> colColored = new HashMap<>();
        int idx = 0, r, c, total;
        for (int i = 0; i < arr.length; i++) {
            idx = index[arr[i]];
            r = idx / col;
            c = idx % col;
            total = rowColored.merge(r, 1, Integer::sum);
            if (total == col) {
                return i;
            }
            total = colColored.merge(c, 1, Integer::sum);
            if (total == row) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

