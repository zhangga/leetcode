/**
 * Leetcode - p0139_word_break
 */
package com.abc.leetcode.p0139_word_break;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean wordBreak(String s, List<String> wordDict);
    
}
