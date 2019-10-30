/**
 * Leetcode - p0146_lru_cache
 */
package com.abc.leetcode.p0146_lru_cache;
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
class LRUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        return getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
