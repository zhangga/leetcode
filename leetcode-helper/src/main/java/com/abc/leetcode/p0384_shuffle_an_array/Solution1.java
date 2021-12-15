/**
 * Leetcode - p0384_shuffle_an_array
 */
package com.abc.leetcode.p0384_shuffle_an_array;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 {

    private int[] array;
    private int[] original;

    private Random random = new Random();

    public Solution1(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    private int randRange(int min, int max) {
        return min + random.nextInt(max - min);
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }

}
