/**
 * Leetcode - p0004_median_of_two_sorted_arrays
 */
package com.abc.leetcode.p0004_median_of_two_sorted_arrays;

import java.util.*;
import com.ciaoshen.leetcode.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Parameterized.class)
public class Tester {

    /**=========================== static for every test cases ============================== */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /** Execute once before any of the test methods in this class. */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        solution = new Solution1();
        // solution = new Solution2();
    }

    /** Execute once after all of the test methods are executed in this class. */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /** Initialize test cases */
    @Parameters
    public static Collection<Object[]> testcases() {
        int nums1_1[] = {1, 3};
        int nums1_2[] = {2};
        double expected1 = 2.0;
        int nums2_1[] = {1, 2};
        int nums2_2[] = {3, 4};
        double expected2 = 2.5;
        return Arrays.asList(new Object[][]{
             {nums1_1, nums1_2, expected1},     // test case 1 (init parameters below: {para1, para2, expected})
             {nums2_1, nums2_2, expected2},     // test case 2 (init parameters below: {para1, para2, expected})
            // {}      // test case 3 (init parameters below: {para1, para2, expected})
        });
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
     private int[] nums1;                       // parameter 1
     private int[] nums2;                       // parameter 2
     private double expected;                    // parameter 3 (expected answer)

    /** This constructor must be provided to run parameterized test. */
    public Tester(int[] nums1, int[] nums2, double expected) {
           // initialize test parameters
         this.nums1 = nums1;
         this.nums2 = nums2;
         this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

         Object actual = solution.findMedianSortedArrays(nums1, nums2);

         assertThat(actual, is(equalTo(expected)));

         if (LOGGER.isDebugEnabled()) {
             LOGGER.debug("findMedianSortedArrays() pass unit test!");
         }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
