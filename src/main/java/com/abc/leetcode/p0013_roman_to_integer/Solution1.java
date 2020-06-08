/**
 * Leetcode - p0013_roman_to_integer
 */
package com.abc.leetcode.p0013_roman_to_integer;
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
    public int romanToInt(String s) {
        Map<Character, Integer> divs = new HashMap<>();
        divs.put('M', 1000);
        divs.put('D', 500);
        divs.put('C', 100);
        divs.put('L', 50);
        divs.put('X', 10);
        divs.put('V', 5);
        divs.put('I', 1);

        int i = 0;
        int num = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int chValue = divs.get(ch);
            if (++i < s.length()) {
                char next = s.charAt(i);
                int nextValue = divs.get(next);
                if (chValue < nextValue) {
                    num += (nextValue - chValue);
                    i++;
                    continue;
                }
            }
            num += chValue;
        }
        return num;
    }

}
