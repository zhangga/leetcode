/**
 * Leetcode - p0027_remove_element
 */
package com.abc.leetcode.p0027_remove_element;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
class Solution1 implements Solution {

	@Override
	public int removeElement(int[] nums, int val) {
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[len++] = nums[i];
			}
		}
		return len;
	}

}
