/**
 * Leetcode - p0074_search_a_2d_matrix
 */
package com.abc.leetcode.p0074_search_a_2d_matrix;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean searchMatrix(int[][] matrix, int target);
    
}
