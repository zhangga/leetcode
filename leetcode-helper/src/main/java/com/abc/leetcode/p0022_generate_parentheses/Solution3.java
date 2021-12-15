/**
 * Leetcode - p0022_generate_parentheses
 */
package com.abc.leetcode.p0022_generate_parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution3 implements Solution {

    private ArrayList[] cache = new ArrayList[100];

    @Override
    public List<String> generateParenthesis(int n) {
        List<List<String>> ret = new LinkedList<>();
        ret.add(new LinkedList<>(Arrays.asList("")));
        ret.add(new LinkedList<>(Arrays.asList("()")));
        for (int i = 2; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = ret.get(j);
                List<String> str2 = ret.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String s = "(" + s1 + ")" + s2;
                        temp.add(s);
                    }
                }
            }
            ret.add(temp);
        }
        return ret.get(n);
    }

}
