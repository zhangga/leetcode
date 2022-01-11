import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1036 lang=java
 *
 * [1036] 逃离大迷宫
 */

// @lc code=start
class Solution {
    Set<Long> blocks = new HashSet<>();
    LinkedList<Long> opens = new LinkedList<>();
    Set<Long> closed = new HashSet<>();
    int maxX = 0, maxY = 0, bound = 0;
    
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        maxX = blocked.length;
        if (maxX > 0) {
            maxY = blocked[0].length;
        }
        for (int[] pos : blocked) {
            blocks.add(toPos(pos[0], pos[1]));
        }
        bound = maxX * (maxX - 1) / 2;
        return check(source, target) && check(target, target);
    }

    private boolean check(int[] pos, int[] target) {
        opens.clear();
        closed.clear();
        opens.addFirst(toPos(pos[0], pos[1]));
        while (!opens.isEmpty()) {
            long p = opens.removeFirst();
            closed.add(p);
            if (closed.size() > bound) {
                return true;
            }
            // 将周围四个格子加入openlist
            int x = (int) (p >> 32);
            int y = (int) (p & 0x0000ffffL);
            if (x == target[0] && y == target[1]) {
                return true;
            }
            if (x - 1 >= 0) {
                p = toPos(x-1, y);
                if (!blocks.contains(p) && !closed.contains(p)) {
                    opens.add(p);
                }
            }
            if (x + 1 < maxX) {
                p = toPos(x+1, y);
                if (!blocks.contains(p) && !closed.contains(p)) {
                    opens.add(p);
                }
            }
            if (y - 1 >= 0) {
                p = toPos(x, y-1);
                if (!blocks.contains(p) && !closed.contains(p)) {
                    opens.add(p);
                }
            }
            if (y + 1 < maxY) {
                p = toPos(x, y+1);
                if (!blocks.contains(p) && !closed.contains(p)) {
                    opens.add(p);
                }
            }
        }
        return false;
    }

    private long toPos(int x, int y) {
        long p = x << 32;
        p += y;
        return p;
    }
}
// @lc code=end

