/**
 * Leetcode - p0970_powerful_integers
 */
package com.abc.leetcode.p0970_powerful_integers;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public List<Integer> powerfulIntegers(int x, int y, int bound);
    
}
