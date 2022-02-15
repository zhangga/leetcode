import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1380 lang=java
 *
 * [1380] 矩阵中的幸运数
 */

// @lc code=start
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        int luckCol = 0;
        boolean lucky = false;
        for (int row = 0; row < matrix.length; row++) {
            // 找到该行最小的列
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == 0) {
                    luckCol = col;
                    continue;
                }
                if (matrix[row][col] < matrix[row][luckCol]) {
                    luckCol = col;
                    continue;
                }
            }
            // 判断是否该列最大
            lucky = true;
            for (int r = 0; r < matrix.length; r++) {
                if (row != r && matrix[r][luckCol] > matrix[row][luckCol]) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                result.add(matrix[row][luckCol]);
            }
        }
        return result;
    }
}
// @lc code=end

