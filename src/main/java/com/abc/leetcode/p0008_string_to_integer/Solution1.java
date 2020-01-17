/**
 * Leetcode - p0008_string_to_integer
 */
package com.abc.leetcode.p0008_string_to_integer;
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
    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ')
            i++;
        // i指向第一个不为空的字符
        if (i == str.length())
            return 0;
        // 判断字符的符号
        int flag = 1;
        char ch = str.charAt(i);
        if (ch == '+') {
            flag = 1;
            i++;
        }
        if (ch >= '0' && ch <= '9')
            flag = 1;
        if (ch == '-') {
            flag = -1;
            i++;
        }
        // 找出数字部分
        int res = 0;
        for (; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch < '0' || ch > '9')
                break;
            res = res * 10 + ch-'0';
            // 溢出判断
            if (flag>0 && i+1<str.length() && str.charAt(i+1)>='0' && str.charAt(i+1)<='9' && res > Integer.MAX_VALUE/10)
                return Integer.MAX_VALUE;
            if (flag>0 && i+1<str.length() && str.charAt(i+1)>='0' && str.charAt(i+1)<='9' && res == Integer.MAX_VALUE/10 && str.charAt(i+1)-'0' > Integer.MAX_VALUE%10)
                return Integer.MAX_VALUE;
            if (flag<0 && i+1<str.length() && str.charAt(i+1)>='0' && str.charAt(i+1)<='9' && -res < Integer.MIN_VALUE/10)
                return Integer.MIN_VALUE;
            if (flag<0 && i+1<str.length() && str.charAt(i+1)>='0' && str.charAt(i+1)<='9' && -res == Integer.MIN_VALUE/10 && -(str.charAt(i+1)-'0') < Integer.MIN_VALUE%10)
                return Integer.MIN_VALUE;
        }
        return res * flag;
    }

}
