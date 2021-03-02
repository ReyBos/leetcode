package set.mismatch;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = new int[] {1, 2, 2, 4};
        int[] expected = new int[] {2, 3};
        assertThat(solution.findErrorNums(nums), is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = new int[] {1, 1};
        int[] expected = new int[] {1, 2};
        assertThat(solution.findErrorNums(nums), is(expected));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = new int[] {2, 2};
        int[] expected = new int[] {2, 1};
        assertThat(solution.findErrorNums(nums), is(expected));
    }
}