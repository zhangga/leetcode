/**
 * Leetcode - p0315_count_of_smaller_numbers_after_self
 */
package com.abc.leetcode.p0315_count_of_smaller_numbers_after_self;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public List<Integer> countSmaller(int[] nums);
    
}
