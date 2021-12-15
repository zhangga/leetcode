/**
 * Leetcode - p0260_single_number
 */
package com.abc.leetcode.p0260_single_number;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 这个题的初级版本中 ，只有一个数出现一次，xor 一遍即可得到答案。为什么呢？
 *
 * A xor A=0
 * 0 xor A=A
 * 并且 xor 满足交换律和结合律。
 * 比如 2 2 3 1 3，2 xor 2 xor 3 xor 1 xor 3
 * = 2 xor 2 xor 3 xor 3 xor 1
 * =(2 xor 2) xor (3 xor 3) xor 1
 * = 0 xor 0 xor 1
 * = 1
 *
 * 在这道加强版的题目里，也会很自然的想到 xor 一遍，那结果是什么呢。假设只出现一次的两个数是 A、B，那我们最后只能得到一个值 = A xor B，但没有办法知道 A 是多少，B 是多少。
 * 那得到的这个值有没有用呢？有，xor 是按位比较，相同为0，不同为1，也就是说得到的这个值里，所有的1都代表了：在这个位置上，A 和 B 是不同的，这给我们区分 A B 提供了一个方法：
 *
 * 我们随便找一个是1的位置（也就是 A和B 在这个位置上的值反正有一个是0 有一个是1），再次遍历一遍数组，按照这个位置上是0还是1分成两组，那么 A 和 B 一定会被分开。而对于其他的数字，无论他们在这个位置上是0还是1，总之他们会两两一对分到两个组中的任意一个组里去。
 *
 * 这就转化成了初级版本的问题了，每个组中都只有一个数出现1次，对两个组分别做一次xor ，得到两个数就是 A 和 B。
 */
class Solution1 implements Solution {

    @Override
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        // 此时res表示不同的两个数A和B的异或结果
        // 在res上找到任何一位为1的数即可，这里找到的是最低位为1的权值
        int lowestBit = Integer.lowestOneBit(res);
        int A = 0, B = 0;
        for (int num : nums) {
            if ((num & lowestBit) == 0) {
                B ^= num;
            }
            else {
                A ^= num;
            }
        }
        return new int[]{A, B};
    }

}
