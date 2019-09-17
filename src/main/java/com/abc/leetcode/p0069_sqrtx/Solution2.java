/**
 * Leetcode - p0069_sqrtx
 */
package com.abc.leetcode.p0069_sqrtx;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 牛顿法
 * https://leetcode-cn.com/problems/sqrtx/solution/er-fen-cha-zhao-niu-dun-fa-python-dai-ma-by-liweiw/
 */
class Solution2 implements Solution {

    @Override
    public int mySqrt(int x) {
        long a = x;
        while (a * a > x) {
            a = (a + x / a) / 2;
        }
        return (int) a;
    }

}
