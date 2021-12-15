/**
 * Leetcode - p0342_power_of_four
 */
package com.abc.leetcode.p0342_power_of_four;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 4 的幂次方的数的二进制表示 1 的位置都是在奇数位。
 * 1010101010101010101010101010101
 */
class Solution2 implements Solution {

    @Override
    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;
        // 先判断是否是 2 的幂
        if ((num & num - 1) != 0)
            return false;
        // 如果与运算之后是本身则是 4 的幂
        if ((num & 0x55555555) == num)
            return true;
        return false;
    }

}
