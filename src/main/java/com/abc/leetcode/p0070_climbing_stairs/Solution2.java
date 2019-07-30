/**
 * Leetcode - p0070_climbing_stairs
 */
package com.abc.leetcode.p0070_climbing_stairs;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 动态规划
 */
class Solution2 implements Solution {

    @Override
    public int climbStairs(int n) {
        if (n < 1) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            int num_1 = 1;
            int num_2 = 2;
            int num = 0;
            for (int i = 3; i <= n; ++i) {
                num = num_1 + num_2;
                num_1 = num_2;
                num_2 = num;
            }
            return num;
        }
    }

}
