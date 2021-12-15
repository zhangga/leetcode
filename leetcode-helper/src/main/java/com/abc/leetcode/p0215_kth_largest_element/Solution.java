/**
 * Leetcode - p0215_kth_largest_element
 */
package com.abc.leetcode.p0215_kth_largest_element;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int findKthLargest(int[] nums, int k);
    
}
