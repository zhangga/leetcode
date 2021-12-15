/**
 * Leetcode - p0125_valid_palindrome
 */
package com.abc.leetcode.p0125_valid_palindrome;
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

    private static boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    private static int toLowerChar(char c) {
        return c >= 'A' && c <= 'Z' ? c + ('a' - 'A') : c;
    }

    @Override
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isAlphaNumeric(s.charAt(i))) {
                i++;
            }
            else if (!isAlphaNumeric(s.charAt(j))) {
                j--;
            }
            else if (toLowerChar(s.charAt(i)) != toLowerChar(s.charAt(j))) {
                break;
            }
            else {
                i++;
                j--;
            }
        }

        return i >= j;
    }
}
