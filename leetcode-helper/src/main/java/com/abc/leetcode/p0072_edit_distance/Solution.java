/**
 * Leetcode - p0072_edit_distance
 */
package com.abc.leetcode.p0072_edit_distance;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int minDistance(String word1, String word2);

}
