/**
 * Leetcode - p0088_merge_sorted_array
 */
package com.abc.leetcode.p0088_merge_sorted_array;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public void merge(int[] nums1, int m, int[] nums2, int n);
    
}
