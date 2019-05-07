/**
 * Leetcode - p0026_remove_duplicates
 */
package com.abc.leetcode.p0026_remove_duplicates;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

	@Override
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2)
			return nums.length;
		int len = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i-1])
				nums[len++] = nums[i];
		}
		return len;
	}

}
