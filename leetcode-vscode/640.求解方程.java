/*
 * @lc app=leetcode.cn id=640 lang=java
 *
 * [640] 求解方程
 */

// @lc code=start
class Solution {
    public String solveEquation(String equation) {
        int x = 0, num = 0, n = equation.length();
        char ch;
        for (int i = 0, op = 1; i < n; ) {
            ch = equation.charAt(i);
            if (ch == '+') {
                op = 1; i++;
            } else if (ch == '-') {
                op = -1; i++;
            } else if (ch == '=') {
                x *= -1; num *= -1; op = 1; i++;
            } else {
                int j = i;
                while (j < n && equation.charAt(j) != '+' && equation.charAt(j) != '-' && equation.charAt(j) != '=') j++;
                if (equation.charAt(j - 1) == 'x') x += (i < j - 1 ? Integer.parseInt(equation.substring(i, j - 1)) : 1) * op;
                else num += Integer.parseInt(equation.substring(i, j)) * op;
                i = j;
            }
        }
        if (x == 0) return num == 0 ? "Infinite solutions" : "No solution";    
        else return "x=" + (num / -x);
    }
}
// @lc code=end

