/**
 * Leetcode - p0295_find_median_from_data
 */
package com.abc.leetcode.p0295_find_median_from_data;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public Solution() {

    }

    public abstract void addNum(int num);

    public abstract double findMedian();
    
}
