/**
 * Leetcode - p0347_top_k_frequent
 */
package com.abc.leetcode.p0347_top_k_frequent;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public List<Integer> topKFrequent(int[] nums, int k);
    
}
