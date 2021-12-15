/**
 * Leetcode - p0205_isomorphic_strings
 */
package com.abc.leetcode.p0205_isomorphic_strings;
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
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> map_s = new HashMap<>();
        Map<Character, Character> map_t = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if ((map_s.containsKey(cs) && map_s.get(cs) != ct) ||
                    (map_t.containsKey(ct) && map_t.get(ct) != cs)) {
                return false;
            }
            map_s.put(cs, ct);
            map_t.put(ct, cs);
        }
        return true;
    }

}
