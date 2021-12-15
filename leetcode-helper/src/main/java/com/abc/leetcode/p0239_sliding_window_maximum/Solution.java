/**
 * Leetcode - p0239_sliding_window_maximum
 */
package com.abc.leetcode.p0239_sliding_window_maximum;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int[] maxSlidingWindow(int[] nums, int k);
    
}
