/**
 * Leetcode - p0150_evaluate_reverse
 */
package com.abc.leetcode.p0150_evaluate_reverse;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 后缀表达式求解
 */
class Solution1 implements Solution {

    @Override
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> list = new LinkedList<>();
        int num1, num2;
        for (String t : tokens) {
            switch (t) {
                case "+":
                    num2 = list.pollFirst();
                    num1 = list.pollFirst();
                    list.addFirst(num1 + num2);
                    continue;
                case "-":
                    num2 = list.pollFirst();
                    num1 = list.pollFirst();
                    list.addFirst(num1 - num2);
                    continue;
                case "*":
                    num2 = list.pollFirst();
                    num1 = list.pollFirst();
                    list.addFirst(num1 * num2);
                    continue;
                case "/":
                    num2 = list.pollFirst();
                    num1 = list.pollFirst();
                    list.addFirst(num1 / num2);
                    continue;
                default:
                    list.addFirst(Integer.valueOf(t));
                    continue;
            }
        }
        return list.pollFirst();
    }

}
