/*
 * @lc app=leetcode.cn id=1657 lang=java
 *
 * [1657] 确定两个字符串是否接近
 */

// @lc code=start

import java.util.Arrays;
import static java.nio.charset.StandardCharsets.ISO_8859_1;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] sCnt = new int[26];
        for (byte c : word1.getBytes(ISO_8859_1)) {
            sCnt[c - 'a']++;
        }

        int[] tCnt = new int[26];
        for (byte c : word2.getBytes(ISO_8859_1)) {
            tCnt[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((sCnt[i] == 0) != (tCnt[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(sCnt);
        Arrays.sort(tCnt);
        return Arrays.equals(sCnt, tCnt);
    }
}
// @lc code=end

