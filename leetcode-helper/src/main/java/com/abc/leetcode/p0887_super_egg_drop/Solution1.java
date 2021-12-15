/**
 * Leetcode - p0887_super_egg_drop
 */
package com.abc.leetcode.p0887_super_egg_drop;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 暴力解法
 * K个鸡蛋，楼层N，在X处扔一个鸡蛋测试
 *                在X处掉落情况        碎了             没碎
 * searchTime(K, N) = max(searchTime(K-1, X-1), searchTime(K, N-X))
 */
class Solution1 implements Solution {

    @Override
    public int superEggDrop(int K, int N) {
        return recursive(K, N);
    }

    private int recursive(int K, int N) {
        if (N == 0 || N == 1 || K == 1) {
            return N;
        }

        int min = N;
        for (int i = 1; i <= N; ++i) {
            int tMin = Math.max(recursive(K-1, i-1), recursive(K, N-i));
            min = Math.min(min, 1+tMin);
        }
        return min;
    }

}
