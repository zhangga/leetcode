/**
 * Leetcode - p0006_zigzag
 */
package com.abc.leetcode.p0006_zigzag;
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
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        char[] sb = new char[s.length()];
        int sbIndex = 0;
        for (int i = 0; i < numRows; i++) {
            int index = i;
            boolean down = i != numRows-1;
            while (index < s.length()) {
                sb[sbIndex++] = s.charAt(index);
                if (down) {
                    index += (numRows - i - 1) * 2;
                    if (i != 0) {
                        down = false;
                    }
                }
                else {
                    index += (i * 2);
                    if (i != numRows - 1) {
                        down = true;
                    }
                }
            }
        }
        return new String(sb);
    }

}
