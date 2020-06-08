/**
 * Leetcode - p0017_letter_combinations
 */
package com.abc.leetcode.p0017_letter_combinations;
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

    private String[] table = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    @Override
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        func(digits, 0, new StringBuilder(), ret);
        return ret;
    }

    private void func(String digits, int i, StringBuilder sb, List<String> ret) {
        if (i >= digits.length()) {
            if (sb.length() > 0) {
                ret.add(sb.toString());
                return;
            }
        }
        else {
            String s = table[digits.charAt(i) - 48 - 2];
            for (int j = 0; j < s.length(); ++j) {
                sb.append(s.charAt(j));
                func(digits, i+1, sb, ret);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

}
