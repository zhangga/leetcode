package com.abc.leetcode.p0315_count_of_smaller_numbers_after_self;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/**
 * 树状数组
 * https://www.xiaoxiongbaby.com/blog/647/
 * Created by U-Demon
 * Date: 2019/10/6
 */
public class Solution2 implements Solution {

    @Override
    public List<Integer> countSmaller(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int len = nums.length;
        if (len == 0) {
            return list;
        }

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }

        // 排名表
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (Integer num : set) {
            map.put(num, rank++);
        }

        FenwickTree fenwickTree = new FenwickTree(len+1);
        // 从后向前填表
        for (int i = len - 1; i >= 0; i--) {
            // 1、查询排名
            rank = map.get(nums[i]);
            // 2、在树状数组排名的那个位置 + 1
            fenwickTree.update(rank, 1);
            // 3、查询一下小于等于“当前排名 - 1”的元素有多少
            list.addFirst(fenwickTree.query(rank - 1));
        }
        return list;
    }

    private class FenwickTree {
        private int[] tree;
        private int len;

        public FenwickTree(int n) {
            this.len = n;
            tree = new int[n+1];
        }

        // 单点更新，将index这个位置+1
        private void update(int i, int delta) {
            // 从下到上
            while (i <= this.len) {
                tree[i] += delta;
                i += lowbit(i);
            }
        }

        // 区间查询：查询小于等于 index 的元素个数
        // 查询的语义是"前缀和"
        public int query(int i) {
            // 从右到左查询
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= lowbit(i);
            }
            return sum;
        }

        private int lowbit(int i) {
            return i & (-i);
        }
    }

}
