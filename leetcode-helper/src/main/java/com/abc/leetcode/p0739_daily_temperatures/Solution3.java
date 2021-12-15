package com.abc.leetcode.p0739_daily_temperatures;

/**
 * Created by U-Demon
 * Date: 2019/12/27
 */
public class Solution3 implements Solution {

    @Override
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        // 栈
        int[] stack = new int[T.length];
        int pos = -1;
        for (int i = T.length - 1; i >= 0; --i) {
            // 栈顶数据比T[i]小
            while (pos >= 0 && T[stack[pos]] <= T[i]) {
                pos--;
            }
            ans[i] = pos < 0 ? 0 : stack[pos] - i;
            stack[++pos] = i;
        }
        return ans;
    }

}
