/**
 * Leetcode - p0387_first_unique_character
 */
package com.abc.leetcode.p0387_first_unique_character;
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
    public int firstUniqChar(String s) {
        char[] chs = new char[26];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (chs[s.charAt(i) - 'a']++ == 0) {
                list.addLast(i);
            }
        }
        while (!list.isEmpty()) {
            int index = list.removeFirst();
            if (chs[s.charAt(index) - 'a'] == 1) {
                return index;
            }
        }
        return -1;
    }

}
