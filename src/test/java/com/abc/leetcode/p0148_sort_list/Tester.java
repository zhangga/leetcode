/**
 * Leetcode - p0148_sort_list
 */
package com.abc.leetcode.p0148_sort_list;

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
        ListNode head1_1 = new ListNode(4);
        ListNode head1_2 = new ListNode(2);
        ListNode head1_3 = new ListNode(1);
        ListNode head1_4 = new ListNode(3);
        head1_1.next = head1_2;
        head1_2.next = head1_3;
        head1_3.next = head1_4;

        ListNode expected1_1 = new ListNode(1);
        ListNode expected1_2 = new ListNode(2);
        ListNode expected1_3 = new ListNode(3);
        ListNode expected1_4 = new ListNode(4);
        expected1_1.next = expected1_2;
        expected1_2.next = expected1_3;
        expected1_3.next = expected1_4;

        ListNode head2_1 = new ListNode(-1);
        ListNode head2_2 = new ListNode(5);
        ListNode head2_3 = new ListNode(3);
        ListNode head2_4 = new ListNode(4);
        ListNode head2_5 = new ListNode(0);
        head2_1.next = head2_2;
        head2_2.next = head2_3;
        head2_3.next = head2_4;
        head2_4.next = head2_5;

        ListNode expected2_1 = new ListNode(-1);
        ListNode expected2_2 = new ListNode(0);
        ListNode expected2_3 = new ListNode(3);
        ListNode expected2_4 = new ListNode(4);
        ListNode expected2_5 = new ListNode(5);
        expected2_1.next = expected2_2;
        expected2_2.next = expected2_3;
        expected2_3.next = expected2_4;
        expected2_4.next = expected2_5;
        return Arrays.asList(new Object[][]{
             {head1_1, expected1_1},     // test case 1 (init parameters below: {para1, para2, expected})
             {head2_1, expected2_1},     // test case 2 (init parameters below: {para1, para2, expected})
            // {}      // test case 3 (init parameters below: {para1, para2, expected})
        });
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
     private ListNode para1;                       // parameter 1
    // private Object para2;                       // parameter 2
     private ListNode expected;                    // parameter 3 (expected answer)

    /** This constructor must be provided to run parameterized test. */
    public Tester(ListNode para1, ListNode expected) {
           // initialize test parameters
         this.para1 = para1;
    //     this.para2 = para2;
         this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

         Object actual = solution.sortList(para1);

         assertThat(actual, is(equalTo(expected)));

         if (LOGGER.isDebugEnabled()) {
             LOGGER.debug("your-method() pass unit test!");
         }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
