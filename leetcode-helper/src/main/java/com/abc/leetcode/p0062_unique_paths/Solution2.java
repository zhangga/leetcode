/**
 * Leetcode - p0062_unique_paths
 */
package com.abc.leetcode.p0062_unique_paths;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 数学法，机器人要走m+n-2步，即从m+n-2中挑出m-1步向下走，即 C_{m+n-2}^{m-1} 。O(\min (m, n)) 。
 */
class Solution2 implements Solution {

    @Override
    public int uniquePaths(int m, int n) {
        double a = m + n - 2;
        int b = (m < n ? m : n) - 1;
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= (a-i) / (i+1);
        }
        // +0.5是为了解决double中 x.9999999或x.0000001之类的问题
        return (int)(res + 0.5);
    }

}
