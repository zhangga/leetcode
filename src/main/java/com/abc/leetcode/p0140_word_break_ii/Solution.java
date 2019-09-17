/**
 * Leetcode - p0140_word_break_ii
 */
package com.abc.leetcode.p0140_word_break_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public List<String> wordBreak(String s, List<String> wordDict);
    
}
