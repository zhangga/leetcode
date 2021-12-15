/**
 * Leetcode - p0010_regular_expression
 */
package com.abc.leetcode.p0010_regular_expression;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean isMatch(String s, String p);

}
