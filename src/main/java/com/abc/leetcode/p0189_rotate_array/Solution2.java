/**
 * Leetcode - p0189_rotate_array
 */
package com.abc.leetcode.p0189_rotate_array;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * We can directly place every number of the array at its required correct position.
 * But if we do that, we will destroy the original element. Thus, we need to store the number being replaced in a temptemp variable.
 * Then, we can place the replaced number(temptemp) at its correct position and so on, nn times, where nn is the length of array.
 * We have chosen nn to be the number of replacements since we have to shift all the elements of the array(which is nn).
 * But, there could be a problem with this method, if n%k=0n where k = k%nk=k(since a value of kk larger than nn eventually leads to a kk equivalent to k%nk).
 * In this case, while picking up numbers to be placed at the correct position, we will eventually reach the number from which we originally started.
 * Thus, in such a case, when we hit the original number's index again, we start the same process with the number following it.
 *
 * Now let's look at the proof of how the above method works. Suppose,
 * we have nn as the number of elements in the array and kk is the number of shifts required.
 * Further, assume n%k=0n. Now, when we start placing the elements at their correct position,
 * in the first cycle all the numbers with their index ii satisfying i%k=0i get placed at their required position.
 * This happens because when we jump k steps every time, we will only hit the numbers k steps apart. We start with index i=0i=0, having i%k=0i.
 * Thus, we hit all the numbers satisfying the above condition in the first cycle. When we reach back the original index, we have placed \frac{n}{k}
 * k
 * n
 * ​
 *  elements at their correct position, since we hit only that many elements in the first cycle.
 *  Now, we increment the index for replacing the numbers. This time, we place other \frac{n}{k}
 * k
 * n
 * ​
 *   elements at their correct position, different from the ones placed correctly in the first cycle,
 *   because this time we hit all the numbers satisfy the condition i%k=1i. When we hit the starting number again,
 *   we increment the index and repeat the same process from i=1i=1 for all the indices satisfying i%k==1i.
 *   This happens till we reach the number with the index i%k=0i again, which occurs for i=ki=k.
 *   We will reach such a number after a total of k cycles. Now, the total count of numbers exclusive numbers placed at their correct position will be k \times \frac{n}{k}=nk×
 * k
 * n
 * ​
 *  =n. Thus, all the numbers will be placed at their correct position.
 *
 * Look at the following example to clarify the process:
 *
 * nums: [1, 2, 3, 4, 5, 6]
 * k: 2
 */
class Solution2 implements Solution {

    @Override
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

}
