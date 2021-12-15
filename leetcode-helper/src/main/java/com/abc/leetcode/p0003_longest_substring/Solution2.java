/**
 * Leetcode - p0003_longest_substring
 */
package com.abc.leetcode.p0003_longest_substring;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * The previous implements all have no assumption on the charset of the string s.

If we know that the charset is rather small, we can replace the Map with an integer array as direct access table.

Commonly used tables are:

int[26] for Letters 'a' - 'z' or 'A' - 'Z'
int[128] for ASCII
int[256] for Extended ASCII
 */
class Solution2 implements Solution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		int ans = 0;
		int[] index = new int[128];
		for (int i = 0, j = 0; j < len; j++) {
			char ch = s.charAt(j);
			i = Math.max(index[ch], i);
			ans = Math.max(ans, j-i+1);
			index[ch] = j+1;
		}
		return ans;
	}

}
