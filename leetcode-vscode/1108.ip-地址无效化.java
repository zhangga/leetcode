/*
 * @lc app=leetcode.cn id=1108 lang=java
 *
 * [1108] IP 地址无效化
 */

// @lc code=start
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
// @lc code=end

