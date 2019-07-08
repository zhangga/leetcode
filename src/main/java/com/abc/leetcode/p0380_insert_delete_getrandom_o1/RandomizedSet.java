/**
 * Leetcode - p0380_insert_delete_getrandom_o1
 */
package com.abc.leetcode.p0380_insert_delete_getrandom_o1;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * insert、remove、getRandom 时间复杂度O(1)
 */
class RandomizedSet {

    private Map<Integer, Integer> v2Index = null;
    private List<Integer> list = null;
    private Random random = null;

    public RandomizedSet() {
        v2Index = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (v2Index.containsKey(val))
            return false;
        v2Index.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!v2Index.containsKey(val))
            return false;
        int index = v2Index.remove(val);
        int last_val = list.get(list.size()-1);
        list.set(index, last_val);
        list.remove(list.size()-1);
        v2Index.replace(last_val, index);
        return true;
    }

    public int getRandom() {
        if (list.size() == 0)
            return 0;
        int index = random.nextInt(list.size());
        return list.get(index);
    }

}
