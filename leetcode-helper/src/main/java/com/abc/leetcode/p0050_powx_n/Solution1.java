/**
 * Leetcode - p0050_powx_n
 */
package com.abc.leetcode.p0050_powx_n;
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
    public double myPow(double x, int n) {
        return n >= 0.0 ? pow(x, n) : 1 / pow(x, -n);
    }

    private double pow(double base, int pow) {
        if (pow == 0) {
            return 1.0;
        }
        else if (pow == 1) {
            return base;
        }
        double half = pow(base, pow / 2);
        return pow % 2 == 0 ? half * half : base * half * half;
    }

}
