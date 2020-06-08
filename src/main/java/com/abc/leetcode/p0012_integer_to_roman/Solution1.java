/**
 * Leetcode - p0012_integer_to_roman
 */
package com.abc.leetcode.p0012_integer_to_roman;
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
    public String intToRoman(int num) {
        int[] divs = {1000, 500, 100, 50, 10, 5, 1};
        char[] divc = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < divs.length; i+=2) {
            int d = num / divs[i];
            num = num % divs[i];
            switch (d) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                    for (int j = 0; j < d; j++) {
                        sb.append(divc[i]);
                    }
                    break;
                case 4:
                    sb.append(divc[i]).append(divc[i-1]);
                    break;
                case 5:
                    sb.append(divc[i-1]);
                    break;
                case 6:
                case 7:
                case 8:
                    sb.append(divc[i-1]);
                    for (int j = 5; j < d; j++) {
                        sb.append(divc[i]);
                    }
                    break;
                case 9:
                    sb.append(divc[i]);
                    sb.append(divc[i-2]);
                    break;
            }
        }
        return sb.toString();
    }

}
