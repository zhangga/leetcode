/**
 * Leetcode - p0136_single_number
 */
package com.abc.leetcode.p0136_single_number;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 异或运算
 * 位上不同才为1
 *
 * 异或位运算：
 * 交换律：a ^ b ^ c <=> a ^ c ^ b
 * 任何数于0异或为任何数 0 ^ n => n
 * 相同的数异或为0: n ^ n => 0
 */
class Solution1 implements Solution {

    @Override
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^=  num;
        }
        return res;
    }

}
