package two.sum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenTargetPositive1() {
        int[] input = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, Solution.twoSum(input, 9));
    }

    @Test
    public void whenTargetPositive2() {
        int[] input = new int[]{3, 2, 4};
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, Solution.twoSum(input, 6));
    }

    @Test
    public void whenTargetNegative() {
        int[] input = new int[]{-1, 3, 2, 4, -1};
        int[] expected = new int[]{0, 4};
        assertArrayEquals(expected, Solution.twoSum(input, -2));
    }

    @Test
    public void whenNumNegativeAndPositive() {
        int[] input = new int[]{-1, 3, 2, 4, -10};
        int[] expected = new int[]{0, 3};
        assertArrayEquals(expected, Solution.twoSum(input, 3));
    }

    @Test
    public void whenEqualsNum() {
        int[] input = new int[]{3, 3};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, Solution.twoSum(input, 6));
    }
}