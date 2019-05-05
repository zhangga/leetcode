/**
 * Leetcode - p0053_maximum_subarray
 */
package com.abc.leetcode.p0053_maximum_subarray;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int maxSubArray(int[] nums);
    
}
