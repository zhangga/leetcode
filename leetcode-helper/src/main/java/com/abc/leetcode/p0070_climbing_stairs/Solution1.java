/**
 * Leetcode - p0070_climbing_stairs
 */
package com.abc.leetcode.p0070_climbing_stairs;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * recursion
 * 递归求解
 * 备忘录算法
 */
class Solution1 implements Solution {

    private Map<Integer, Integer> cached = new HashMap<>();

    @Override
    public int climbStairs(int n) {
        if (n < 1)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        if (cached.containsKey(n))
            return cached.get(n);
        else {
            int num = climbStairs(n - 1) + climbStairs(n - 2);
            cached.put(n, num);
            return num;
        }
    }

}
