/**
 * Leetcode - p0224_basic_calculator
 */
package com.abc.leetcode.p0224_basic_calculator;
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

    int i = -1;

    @Override
    public int calculate(String s) {
        return parse(s);
    }

    public int parse(String s) {
        int ans = 0;
        boolean plus = true;
        while (++i < s.length()) {
            switch (s.charAt(i)) {
                // 忽略空格
                case ' ':
                    continue;
                case '+':
                    plus = true;
                    continue;
                case '-':
                    plus = false;
                    continue;
                case '(':
                    if (plus) {
                        ans += parse(s);
                    }
                    else {
                        ans -= parse(s);
                    }
                    continue;
                case ')':
                    return ans;
                default:
                    if (plus) {
                        ans += parseInt(s);
                    }
                    else {
                        ans -= parseInt(s);
                    }
                    continue;
            }
        }
        return ans;
    }

    public int parseInt(String s) {
        int ans = 0;
        for (; i < s.length() && Character.isDigit(s.charAt(i)); i++) {
            ans *= 10;
            ans += Integer.valueOf(s.charAt(i)+"");
        }
        i--;
        return ans;
    }

}
