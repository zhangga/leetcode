/**
 * Leetcode - p0005_longest_substring
 */
package com.abc.leetcode.p0005_longest_substring;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * Manacher算法
 * 马拉车算法
 */
class Solution1 implements Solution {

	@Override
	public String longestPalindrome(String s) {
		// 生成新串，添加#
		char[] T = new char[s.length()*2 + 1];
		int[] Len = new int[T.length];
		for (int i = 0; i < s.length(); i++) {
			T[2*i+1] = s.charAt(i);
		}
		Len[0] = 1;
		int p0 = 0, p = 0;
		for (int i = 1; i < Len.length; i++) {
			Len[i] = i < p ? Math.min(Len[2*p0-i], p-i+1) : 1;
			while (i-Len[i] >= 0 && i+Len[i] < T.length && T[i-Len[i]] == T[i+Len[i]]) {
				Len[i]++;
			}
			if (Len[i] > p-p0+1) {
				p0=i;
				p=i+Len[i]-1;
			}
		}
		return s.substring((2*p0-p)/2, p/2);
	}

}
