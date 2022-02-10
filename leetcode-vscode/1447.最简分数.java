import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1447 lang=java
 *
 * [1447] 最简分数
 */

// @lc code=start
class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            list.add(1+"/"+i);
            for (int j = 2; j < i; j++) {
                if (gcd(j, i) == 1) {
                    list.add(j+"/"+i);
                }
            }
        }
        return list;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
// @lc code=end

