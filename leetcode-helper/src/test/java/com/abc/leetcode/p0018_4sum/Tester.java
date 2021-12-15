/**
 * Leetcode - p0018_4sum
 */
package com.abc.leetcode.p0018_4sum;

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
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1,  0, 0, 1));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2,  0, 0, 2));

        int[] nums2 = {2,1,0,-1};
        int target2 = 2;
        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(-1,  0, 1, 2));
        return Arrays.asList(new Object[][]{
             {nums, target, expected},     // test case 1 (init parameters below: {para1, para2, expected})
             {nums2, target2, expected2},     // test case 2 (init parameters below: {para1, para2, expected})
            // {}      // test case 3 (init parameters below: {para1, para2, expected})
        });
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
     private int[] para1;                       // parameter 1
     private int para2;                       // parameter 2
     private List<List<Integer>> expected;                    // parameter 3 (expected answer)

    /** This constructor must be provided to run parameterized test. */
    public Tester(int[] para1, int para2, List<List<Integer>> expected) {
           // initialize test parameters
         this.para1 = para1;
         this.para2 = para2;
         this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

         Object actual = solution.fourSum(para1, para2);

         assertThat(actual, is(equalTo(expected)));

         if (LOGGER.isDebugEnabled()) {
             LOGGER.debug("your-method() pass unit test!");
         }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
