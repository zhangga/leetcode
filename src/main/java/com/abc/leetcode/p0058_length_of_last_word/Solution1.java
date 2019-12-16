/**
 * Leetcode - p0058_length_of_last_word
 */
package com.abc.leetcode.p0058_length_of_last_word;
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
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (len > 0) {
                    len = -len;
                }
                continue;
            }
            if (len < 0)
                len = 0;
            len++;
        }
        return Math.abs(len);
    }

}
