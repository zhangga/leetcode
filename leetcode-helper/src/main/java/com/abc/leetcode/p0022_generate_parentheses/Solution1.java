/**
 * Leetcode - p0022_generate_parentheses
 */
package com.abc.leetcode.p0022_generate_parentheses;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/**
 * 全排列
 */
class Solution1 implements Solution {

    @Override
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateAll(new char[n*2], 0, ret);
        return ret;
    }

    private void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        }
        else {
            current[pos] = '(';
            generateAll(current, pos+1, result);
            current[pos] = ')';
            generateAll(current, pos+1, result);
        }
    }

    private boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(')
                balance++;
            else
                balance--;
            if (balance < 0)
                return false;
        }
        return balance == 0;
    }

}
