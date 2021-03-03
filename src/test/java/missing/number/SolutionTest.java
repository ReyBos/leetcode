package missing.number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {3, 0, 1};
        assertEquals(2, solution.missingNumber(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, solution.missingNumber(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] input = new int[] {0};
        assertEquals(1, solution.missingNumber(input));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] input = new int[] {9, 6, 4, 2, 3, 5, 7, 8, 1};
        assertEquals(0, solution.missingNumber(input));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] input = new int[] {8, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(9, solution.missingNumber(input));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        int[] input = new int[] {1};
        assertEquals(0, solution.missingNumber(input));
    }
}