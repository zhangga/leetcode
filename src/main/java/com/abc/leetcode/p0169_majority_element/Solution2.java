/**
 * Leetcode - p0169_majority_element
 */
package com.abc.leetcode.p0169_majority_element;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 对数据进行排序，众数为超过总数一半的数
 * 所以众数会在中间
 */
class Solution2 implements Solution {

    @Override
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
