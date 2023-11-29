/*
 * @lc app=leetcode.cn id=2336 lang=java
 *
 * [2336] 无限集中的最小数字
 */

// @lc code=start

import java.util.TreeSet;

class SmallestInfiniteSet {

    private int thres;
    private TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        thres = 1;
        set = new TreeSet<Integer>();
    }
    
    public int popSmallest() {
        if (set.isEmpty()) {
            int ans = thres;
            ++thres;
            return ans;
        }
        int ans = set.pollFirst();
        return ans;
    }
    
    public void addBack(int num) {
        if (num < thres) {
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
// @lc code=end

