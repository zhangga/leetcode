/**
 * Leetcode - p0970_powerful_integers
 */
package com.abc.leetcode.p0970_powerful_integers;
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
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i <= (x == 1 ? 0 : Math.log(bound) / Math.log(x)); i++) {
            for (int j = 0; j <= (y == 1 ? 0 : Math.log(bound) / Math.log(y)); j++) {
                int powerful = ((int) Math.pow(x, i)) + ((int) Math.pow(y, j));
                if (powerful <= bound) list.add(powerful);
            }
        }
        return new ArrayList<>(list);
    }

}
