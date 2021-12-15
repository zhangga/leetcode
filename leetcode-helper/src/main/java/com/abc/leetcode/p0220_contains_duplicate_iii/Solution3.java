package com.abc.leetcode.p0220_contains_duplicate_iii;

import java.util.HashMap;
import java.util.Map;

/**
 * 桶。时间复杂度O(n)
 * Created by U-Demon
 * Date: 2019/8/28
 */
public class Solution3 implements Solution {

    private long getID(long x, long w) {
        return x < 0 ? (x+1)/w - 1 : x/w;
    }

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0)
            return false;
        // 每个桶中只会保存一个数据，因为有两个数据的话，说明已经满足条件返回了。
        Map<Long, Integer> buckets = new HashMap<>();
        long w = t + 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            long id = getID(num, w);
            // 同一个桶中有数据
            if (buckets.containsKey(id))
                return true;
            // 相邻的左边桶中有数据
            if (buckets.containsKey(id - 1) && Math.abs(num - buckets.get(id - 1)) < w)
                return true;
            // 相邻的右边桶中有数据
            if (buckets.containsKey(id + 1) && Math.abs(num - buckets.get(id + 1)) < w)
                return true;
            // 桶中始终只有一个数据存在
            buckets.put(id, num);
            // 超过k，移除最早的
            if (i >= k) {
                buckets.remove(getID(nums[i - k], w));
            }
        }
        return false;
    }

}
