/*
 * @lc app=leetcode.cn id=307 lang=java
 *
 * [307] 区域和检索 - 数组可修改
 */

// @lc code=start
class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public void update(int index, int val) {
        if (index >= 0 && index <= this.nums.length) {
            this.nums[index] = val;
        }
    }
    
    public int sumRange(int left, int right) {
        if (left > right) {
            return 0;
        }
        left = left < 0 ? 0 : left;
        right = right >= this.nums.length ? this.nums.length - 1 : right;
        int sum = 0;
        for (; left <= right; left++) {
            sum += this.nums[left];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
// @lc code=end

