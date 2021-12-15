/**
 * Leetcode - p0012_integer_to_roman
 */
package com.abc.leetcode.p0012_integer_to_roman;
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
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};  // 罗马数字
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};  // 阿拉伯数字
        int index = 0;
        while (num > 0) {
            int count = num / arab[index];
            while (count-- > 0) {
                ans.append(roman[index]);
            }
            num %= arab[index];
            index++;
        }
        return ans.toString();
    }

}
