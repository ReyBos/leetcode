package decode.xored.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] encoded = new int[]{1, 2, 3};
        int[] rsl = solution.decode(encoded, 1);
        int[] expected = new int[]{1, 0, 2, 1};
        assertThat(rsl, is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] encoded = new int[]{6, 2, 7, 3};
        int[] rsl = solution.decode(encoded, 4);
        int[] expected = new int[]{4, 2, 0, 7, 4};
        assertThat(rsl, is(expected));
    }
}