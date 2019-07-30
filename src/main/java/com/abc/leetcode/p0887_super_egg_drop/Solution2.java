/**
 * Leetcode - p0887_super_egg_drop
 */
package com.abc.leetcode.p0887_super_egg_drop;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/**
 * https://leetcode-cn.com/problems/super-egg-drop/solution/ji-dan-diao-luo-xiang-jie-by-shellbye/
 * K个鸡蛋在M步内可以测出的最多层数，令dp[k][m]表示，那么当我们在第X层扔鸡蛋的时候：
 * 1.鸡蛋碎了，(N-X) + dp[k-1][m-1]
 * 2.鸡蛋没碎，鸡蛋的数量没有变化，但是用掉了一步，剩余X + dp[k][m-1]
 */
class Solution2 implements Solution {

    @Override
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        for (int m = 1; m <= N; m++) {
            dp[0][m] = 0;
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k][m-1] + dp[k-1][m-1] + 1;
                if (dp[k][m] >= N) {
                    return m;
                }
            }
        }
        return N;
    }
}
