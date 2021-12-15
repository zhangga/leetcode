/**
 * Leetcode - p0018_4sum
 */
package com.abc.leetcode.p0018_4sum;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public List<List<Integer>> fourSum(int[] nums, int target);
    
}
