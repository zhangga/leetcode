import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=846 lang=java
 *
 * [846] 一手顺子
 */

// @lc code=start
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        Map<Integer, Integer> counts = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> a-b);
        for (int num : hand) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            queue.add(num);
        }
        int count = 0, num = 0, group = 0;
        while (!queue.isEmpty()) {
            group = 0;
            num = queue.poll();
            count = counts.get(num);
            if (count == 0)
                continue;
            counts.put(num, count - 1);
            group++;
            while (group < groupSize) {
                count = counts.getOrDefault(++num, 0);
                if (count == 0)
                    return false;
                counts.put(num, count-1);
                group++;
            }
        }
        return true;
    }
}
// @lc code=end

