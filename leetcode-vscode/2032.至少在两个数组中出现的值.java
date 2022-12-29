import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=2032 lang=java
 *
 * [2032] 至少在两个数组中出现的值
 */

// @lc code=start
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums1) {
            map.put(i, 1);
        }
        for (int i : nums2) {
            map.put(i, map.getOrDefault(i, 0) | 2);
        }
        for (int i : nums3) {
            map.put(i, map.getOrDefault(i, 0) | 4);
        }
        List<Integer> res = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey(), v = entry.getValue();
            if ((v & (v - 1)) != 0) {
                res.add(k);
            }
        }
        return res;
    }
}
// @lc code=end

