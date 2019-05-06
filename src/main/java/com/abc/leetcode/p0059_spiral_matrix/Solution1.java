/**
 * Leetcode - p0059_spiral_matrix
 */
package com.abc.leetcode.p0059_spiral_matrix;
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
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int r1 = 0, r2 = n-1;
        int c1 = 0, c2 = n-1;
        int num = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                matrix[r1][c] = num++;
            }
            for (int r = r1+1; r <= r2; r++) {
                matrix[r][c2] = num++;
            }
            if (r2 > r1 && c2 > c1) {
                for (int c = c2-1; c >= c1; c--) {
                    matrix[r2][c] = num++;
                }
                for (int r = r2-1; r > r1; r--) {
                    matrix[r][c1] = num++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return matrix;
    }

}
