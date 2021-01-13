package how.many.numbers.are.smaller.than.the.current.number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[]{6, 5, 4, 8};
        int[] expected = new int[]{2, 1, 0, 3};
        int[] rsl = solution.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[]{8, 1, 2, 2, 3};
        int[] expected = new int[]{4, 0, 1, 1, 3};
        int[] rsl = solution.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] input = new int[]{7, 7, 7, 7};
        int[] expected = new int[]{0, 0, 0, 0};
        int[] rsl = solution.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] input = new int[]{5, 0, 10, 0, 10, 6};
        int[] expected = new int[]{2, 0, 4, 0, 4, 3};
        int[] rsl = solution.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, rsl);
    }
}