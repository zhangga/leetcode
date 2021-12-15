/**
 * Leetcode - p0121_sell_stock
 */
package com.abc.leetcode.p0121_sell_stock;
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
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int min = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }

}
