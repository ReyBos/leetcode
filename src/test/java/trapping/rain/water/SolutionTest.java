package trapping.rain.water;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, solution.trap(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {4, 2, 0, 3, 2, 5};
        assertEquals(9, solution.trap(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] input = new int[] {0, 1, 2, 3};
        assertEquals(0, solution.trap(input));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] input = new int[] {3, 2, 1, 0};
        assertEquals(0, solution.trap(input));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] input = new int[] {3, 0, 0, 3};
        assertEquals(6, solution.trap(input));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        int[] input = new int[] {4, 2, 3};
        assertEquals(1, solution.trap(input));
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        int[] input = new int[] {4, 2, 2, 3};
        assertEquals(2, solution.trap(input));
    }
}