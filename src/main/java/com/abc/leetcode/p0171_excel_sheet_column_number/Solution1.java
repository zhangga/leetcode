/**
 * Leetcode - p0171_excel_sheet_column_number
 */
package com.abc.leetcode.p0171_excel_sheet_column_number;
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
    public int titleToNumber(String s) {
        int num = 0;
        int len = s.length() - 1;
        for (int i = 0; i <= len; i++) {
            char ch = s.charAt(i);
            int chNum = ((int) ch) - 64;
            num += (chNum * Math.pow(26, len - i));
        }
        return num;
    }
}
