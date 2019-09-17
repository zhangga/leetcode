/**
 * Leetcode - p0220_contains_duplicate_iii
 */
package com.abc.leetcode.p0220_contains_duplicate_iii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t);
    
}
