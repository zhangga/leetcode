/**
 * Leetcode - p0009_palindrome_number
 */
package com.abc.leetcode.p0009_palindrome_number;
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
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int org = x;
        long num = 0;
        while (x != 0) {
            int low = x % 10;
            num = num * 10 + low;
            x = x / 10;
        }
        return num == org;
    }
}
