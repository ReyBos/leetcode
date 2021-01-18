package decompress.run.length.encoded.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 2, 3, 4};
        int[] rsl = solution.decompressRLElist(input);
        int[] expected = new int[] {2, 4, 4, 4};
        assertThat(rsl, is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {1, 1, 2, 3};
        int[] rsl = solution.decompressRLElist(input);
        int[] expected = new int[] {1, 3, 3};
        assertThat(rsl, is(expected));
    }
}