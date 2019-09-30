/**
 * Leetcode - p0287_find_the_duplicate_number
 */
package com.abc.leetcode.p0287_find_the_duplicate_number;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int findDuplicate(int[] nums);
    
}
