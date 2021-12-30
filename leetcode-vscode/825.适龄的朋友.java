import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=825 lang=java
 *
 * [825] 适龄的朋友
 */

// @lc code=start
class Solution {
    // [6,6]
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int total = 0, eq = 1, lc = 0, j = 0;
        for (int i = ages.length - 1; i > 0; i--) {
            // 先判断相等
            if (ages[i] == ages[i-1]) {
                eq++;
                continue;
            }
            if (eq > 1 && ages[i] > 0.5*ages[i] + 7) {
                total += (eq * (eq - 1));
            }
            j = i - 1;
            lc = 0;
            while (j >= 0) {
                if (ages[j] <= 0.5*ages[i] + 7) {
                    break;
                }
                if (ages[j] > 100 && ages[i] < 100) {
                    break;
                }
                lc++;
                j--;
            }
            if (lc > 0) {
                total += (eq * lc);
            }
            eq = 1;
        }
        if (eq > 1 && ages[0] > 0.5*ages[0] + 7) {
            total += (eq * (eq - 1));
        }
        return total;
    }
}
// @lc code=end

