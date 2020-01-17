/**
 * Leetcode - p0072_edit_distance
 */
package com.abc.leetcode.p0072_edit_distance;
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
class Solution2 implements Solution {

    @Override
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[] dp = new int[n2 + 1];
        for (int j = 0; j <= n2; j++)
            dp[j] = j;
        for (int i = 1; i <= n1; i++) {
            int temp = dp[0];
            // 相当于初始化
            dp[0] = i;
            for (int j = 1; j <= n2; j++) {
                // pre 相当于之前的 dp[i-1][j-1]
                int pre = temp;
                temp = dp[j];
                // 如果 word1[i] 与 word2[j] 相等。第 i 个字符对应下标是 i-1
                if (word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[j] = pre;
                }else {
                    dp[j] = Math.min(Math.min(dp[j - 1], pre), dp[j]) + 1;
                }
                // 保存要被抛弃的值
            }
        }
        return dp[n2];
    }

}
