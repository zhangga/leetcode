/**
 * Leetcode - p0028_implement_strstr
 */
package com.abc.leetcode.p0028_implement_strstr;
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
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            for (; j < needle.length(); j++) {
                if (i+j < haystack.length() && needle.charAt(j) == haystack.charAt(i+j))
                    continue;
                else
                    break;
            }
            if (j == needle.length())
                return i;
        }
        return -1;
    }

}
