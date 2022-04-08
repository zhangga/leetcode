import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Node> d = new ArrayDeque<>();
        if (root != null) d.addLast(root);
        while (!d.isEmpty()) {
            int size = d.size();
            List<Integer> list = new ArrayList<>();
            while (size-- > 0) {
                Node t = d.pollFirst();
                for (Node node : t.children) d.addLast(node);
                list.add(t.val);
            }
            ans.add(list);
        }
        return ans;
    }
}
// @lc code=end

