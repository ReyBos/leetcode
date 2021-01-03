package shuffle.the.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenN1() {
        Solution solution = new Solution();
        int[] input = new int[]{1, 2};
        int[] out = solution.shuffle(input, 1);
        int[] expected = new int[]{1, 2};
        assertThat(out, is(expected));
    }

    @Test
    public void whenN2() {
        Solution solution = new Solution();
        int[] input = new int[]{1, 1, 2, 2};
        int[] out = solution.shuffle(input, 2);
        int[] expected = new int[]{1, 2, 1, 2};
        assertThat(out, is(expected));
    }

    @Test
    public void whenN3() {
        Solution solution = new Solution();
        int[] input = new int[]{0, 1, 2, 3, 4, 5};
        int[] out = solution.shuffle(input, 3);
        int[] expected = new int[]{0, 3, 1, 4, 2, 5};
        assertThat(out, is(expected));
    }

    @Test
    public void whenN4() {
        Solution solution = new Solution();
        int[] input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int[] out = solution.shuffle(input, 4);
        int[] expected = new int[]{1, 4, 2, 3, 3, 2, 4, 1};
        assertThat(out, is(expected));
    }

    @Test
    public void whenN6() {
        Solution solution = new Solution();
        int[] input = new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        };
        int[] out = solution.shuffle(input, 6);
        int[] expected = new int[]{
                0, 6, 1, 7, 2, 8, 3, 9, 4, 10, 5, 11
        };
        assertThat(out, is(expected));
    }

    @Test
    public void whenN7() {
        Solution solution = new Solution();
        int[] input = new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        };
        int[] out = solution.shuffle(input, 7);
        int[] expected = new int[]{
                0, 7, 1, 8, 2, 9, 3, 10, 4, 11, 5, 12, 6, 13
        };
        assertThat(out, is(expected));
    }

    @Test
    public void whenN8() {
        Solution solution = new Solution();
        int[] input = new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
        };
        int[] out = solution.shuffle(input, 8);
        int[] expected = new int[]{
                0, 8, 1, 9, 2, 10, 3, 11, 4, 12, 5, 13, 6, 14, 7, 15
        };
        assertThat(out, is(expected));
    }
}