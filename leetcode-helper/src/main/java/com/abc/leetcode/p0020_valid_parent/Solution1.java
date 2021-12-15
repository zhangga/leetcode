/**
 * Leetcode - p0020_valid_parent
 */
package com.abc.leetcode.p0020_valid_parent;
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
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if ((c == ')' && !stack.isEmpty() && stack.pop() == '(')
                    || (c == ']' && !stack.isEmpty() && stack.pop() == '[')
                    || (c == '}' && !stack.isEmpty() && stack.pop() == '{')) {
                continue;
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
