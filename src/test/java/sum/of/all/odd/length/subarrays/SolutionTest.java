package sum.of.all.odd.length.subarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 4, 2, 5, 3};
        assertEquals(58, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 2};
        assertEquals(3, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] input = new int[] {10, 11, 12};
        assertEquals(66, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 2, 3, 4};
        assertEquals(25, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 1, 1, 1, 1, 1};
        assertEquals(28, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 1, 1, 1, 1, 1, 1};
        assertEquals(44, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(60, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test8() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(85, solution.sumOddLengthSubarrays(input));
    }

    @Test
    public void test9() {
        Solution solution = new Solution();
        int[] input = new int[] {1};
        assertEquals(1, solution.sumOddLengthSubarrays(input));
    }
}