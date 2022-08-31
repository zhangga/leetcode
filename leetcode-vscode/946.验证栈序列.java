/*
 * @lc app=leetcode.cn id=946 lang=java
 *
 * [946] 验证栈序列
 */

// @lc code=start
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length, idx = 0;
        for (int i = 0, j = 0; i < n; i++) {
            pushed[idx++] = pushed[i];
            while (idx > 0 && pushed[idx - 1] == popped[j] && ++j >= 0) idx--;
        }
        return idx == 0;
    }
}
// @lc code=end

