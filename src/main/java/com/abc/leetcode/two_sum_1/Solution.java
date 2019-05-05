/**
 * Leetcode - two_sum_1
 */
package com.abc.leetcode.two_sum_1;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int[] twoSum(int[] nums, int target);
}
