/**
 * Leetcode - p0074_search_a_2d_matrix
 */
package com.abc.leetcode.p0074_search_a_2d_matrix;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 在二维矩阵中搜索一个数在不在
 * 二分法
 */
class Solution1 implements Solution {

    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        // 矩阵的宽高
        int height = matrix.length;
        if (height == 0)
            return false;
        int width = matrix[0].length;
        if (width == 0)
            return false;
        int left = 0;
        int right = height * width - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int i = middle / width;
            int j = middle % width;
            if (matrix[i][j] < target) {
                left = middle + 1;
            }
            else if (matrix[i][j] > target) {
                right = middle - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
