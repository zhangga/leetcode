/**
 * Leetcode - p0062_unique_paths
 */
package com.abc.leetcode.p0062_unique_paths;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 不同路径
 * 动态规划：当 m,n>1 时f(m,n) = f(m-1, n) + f(m, n-1)  ， f(1, n) = f(m,1)=1 。时间复杂度：O(mn)
 */
class Solution1 implements Solution {

    @Override
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }
        return matrix[m-1][n-1];
    }

}
