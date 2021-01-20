package create.target.array.in.the.given.order;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = new int[] {0, 1, 2, 3, 4};
        int[] index = new int[] {0, 1, 2, 2, 1};
        int[] rsl = solution.createTargetArray(nums, index);
        int[] expected = new int[] {0, 4, 1, 3, 2};
        assertArrayEquals(rsl, expected);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = new int[] {1, 2, 3, 4, 0};
        int[] index = new int[] {0, 1, 2, 3, 0};
        int[] rsl = solution.createTargetArray(nums, index);
        int[] expected = new int[] {0, 1, 2, 3, 4};
        assertArrayEquals(rsl, expected);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = new int[] {1};
        int[] index = new int[] {0};
        int[] rsl = solution.createTargetArray(nums, index);
        int[] expected = new int[] {1};
        assertArrayEquals(rsl, expected);
    }
}