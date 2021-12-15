/**
 * Leetcode - p0022_generate_parentheses
 */
package com.abc.leetcode.p0022_generate_parentheses;
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
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        backtrack(ret, new StringBuilder(), 0, 0, n);
        return ret;
    }

    private void backtrack(List<String> ret, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ret.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append("(");
            backtrack(ret, cur, open+1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(")");
            backtrack(ret, cur, open, close+1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

}
