/**
 * Leetcode - p0242_valid_anagram
 */
package com.abc.leetcode.p0242_valid_anagram;
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
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        // 都是小写字母
        int[] nums = new int[26];
        // s字符串
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }
        // t字符串
        for (int i = 0; i < t.length(); i++) {
            if (nums[t.charAt(i) - 'a']-- <= 0) {
                return false;
            }
        }
        return true;
    }

}
