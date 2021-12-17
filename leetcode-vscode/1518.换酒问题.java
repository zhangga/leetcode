/*
 * @lc app=leetcode.cn id=1518 lang=java
 *
 * [1518] 换酒问题
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt = numBottles / (numExchange  - 1);
        return numBottles % (numExchange - 1) == 0 ? numBottles + cnt - 1 : numBottles + cnt;
    }
}
// @lc code=end

