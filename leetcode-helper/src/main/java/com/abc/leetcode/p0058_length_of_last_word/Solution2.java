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
class Solution2 implements Solution {

    @Override
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (len > 0) return len;
                else continue;
            }
            len++;
        }
        return len;
    }

}
