/**
 * Leetcode - p0003_longest_substring
 */
package com.abc.leetcode.p0003_longest_substring;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * Sliding Window Optimized
 * 
 * The above solution requires at most 2n steps. In fact, it could be optimized to require only n steps. 
 * Instead of using a set to tell if a character exists or not, we could define a mapping of the characters to its index. 
 * Then we can skip the characters immediately when we found a repeated character.

The reason is that if s[j]s[j] have a duplicate in the range [i, j)[i,j) with index j'j 
′
 , we don't need to increase ii little by little. We can skip all the elements in the range [i, j'][i,j 
′
 ] and let ii to be j' + 1j 
′
 +1 directly.
 */
class Solution1 implements Solution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		int ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; j < len; j++) {
			char ch = s.charAt(j);
			if (map.containsKey(ch)) {
				i = Math.max(map.get(ch), i);
			}
			ans = Math.max(ans, j-i+1);
			map.put(ch, j+1);
		}
		return ans;
	}

}
