/**
 * Leetcode - p0378_kth_smallest_element
 */
package com.abc.leetcode.p0378_kth_smallest_element;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int kthSmallest(int[][] matrix, int k);
    
}
