import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=954 lang=java
 *
 * [954] 二倍数对数组
 */

// @lc code=start
class Solution {
    public boolean canReorderDoubled(int[] arr) {
        // 首先排序数组
        Arrays.sort(arr);
        // 最小正数和最大负数的索引
        int minPositiveIndex = -2, maxNegativeIndex = -2;
        // map统计每个数出现的次数
        Map<Integer, Integer> count = new HashMap<>();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            if (num != 0) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            if (minPositiveIndex == -2 && num > 0) {
                minPositiveIndex = i;
            }
            if (maxNegativeIndex == -2 && num >= 0) {
                maxNegativeIndex = i - 1;
            }
            if (maxNegativeIndex == -2 && i == arr.length - 1) {
                maxNegativeIndex = i;
            }
        }
        // 判断正数
        if (minPositiveIndex >= 0) {
            // 必须有偶数个长度
            if ((arr.length - minPositiveIndex)%2 != 0) {
                return false;
            }
            for (int i = minPositiveIndex; i < arr.length; i++) {
                num = arr[i];
                if (count.get(num) == 0) {
                    continue;
                }
                if (count.getOrDefault(num * 2, 0) == 0) {
                    return false;
                }
                count.put(num*2, count.get(num*2)-1);
                count.put(num, count.get(num)-1);
            }
        }
        // 判断负数
        if (maxNegativeIndex >= 0) {
            // 必须有偶数个长度
            if ((maxNegativeIndex)%2 == 0) {
                return false;
            }
            for (int i = maxNegativeIndex; i >= 0; i--) {
                num = arr[i];
                if (count.get(num) == 0) {
                    continue;
                }
                if (count.getOrDefault(num * 2, 0) == 0) {
                    return false;
                }
                count.put(num*2, count.get(num*2)-1);
                count.put(num, count.get(num)-1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

