/**
 * Leetcode - p0219_contains_duplicate_ii
 */
package com.abc.leetcode.p0219_contains_duplicate_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean containsNearbyDuplicate(int[] nums, int k);
    
}
