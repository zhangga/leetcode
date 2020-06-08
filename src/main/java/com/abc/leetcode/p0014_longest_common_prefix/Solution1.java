/**
 * Leetcode - p0014_longest_common_prefix
 */
package com.abc.leetcode.p0014_longest_common_prefix;
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
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int index = 1; index < strs.length; index++) {
                if (i >= strs[index].length() || strs[index].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

}
