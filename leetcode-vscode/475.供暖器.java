import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=475 lang=java
 *
 * [475] 供暖器
 */

// @lc code=start
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int j = 0, dis = 0;
        for (int i = 0; i < houses.length; i++) {
            while (j < heaters.length-1 && heaters[j] < houses[i]) j++;
            if (j == 0) {
                dis = Math.max(dis, Math.abs(heaters[j] - houses[i])); 
            } else {
                dis = Math.max(dis, Math.min(Math.abs(houses[i] - heaters[j-1]), Math.abs(heaters[j] - houses[i]))); 
            }
        }
        return dis;
    }
}
// @lc code=end

