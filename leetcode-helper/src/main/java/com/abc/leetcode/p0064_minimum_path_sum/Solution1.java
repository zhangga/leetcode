/**
 * Leetcode - p0064_minimum_path_sum
 */
package com.abc.leetcode.p0064_minimum_path_sum;
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
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 0)
            return 0;
        int col = grid[0].length;
        if (col == 0)
            return 0;
        for (int i = 1; i < col; i++) {
            grid[0][i] += grid[0][i-1];
        }
        for (int i = 1; i < row; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }

}
