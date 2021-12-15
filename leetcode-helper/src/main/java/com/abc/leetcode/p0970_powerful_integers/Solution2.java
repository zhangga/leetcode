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
class Solution2 implements Solution {

    @Override
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();
        int sq = (int)Math.sqrt(bound);
        int i = 0, j = 0;
        int xBound = sq;
        int yBound = sq;
        if(x == 1){
            xBound = 0;
        }
        if(y == 1){
            yBound = 0;
        }
        while(i <= xBound && Math.pow(x, i) <= bound){
            int tempBound = (int)Math.pow(x, i) + (int)Math.pow(y, j);
            if(tempBound <= bound && j <= yBound){
                if(!res.contains(tempBound)){
                    res.add(tempBound);
                }
                j++;
            }
            else{
                i++;
                j = 0;
            }
        }
        return res;
    }

}
