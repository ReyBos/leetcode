package running.sum.of.one.dimensional.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenInput1234() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {1, 3, 6, 10};
        int[] rsl = solution.runningSum(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenInput1() {
        Solution solution = new Solution();
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] rsl = solution.runningSum(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenInput1111() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 2, 3, 4};
        int[] rsl = solution.runningSum(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenInput3251() {
        Solution solution = new Solution();
        int[] input = new int[] {3, 2, 5, 1};
        int[] expected = new int[] {3, 5, 10, 11};
        int[] rsl = solution.runningSum(input);
        assertThat(rsl, is(expected));
    }
}