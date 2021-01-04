package kids.with.the.greatest.number.of.candies;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[]{2, 3, 5, 1, 3};
        List<Boolean> out = solution.kidsWithCandies(input, 3);
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertThat(out, is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[]{4, 2, 1, 1, 2};
        List<Boolean> out = solution.kidsWithCandies(input, 1);
        List<Boolean> expected = List.of(true, false, false, false, false);
        assertThat(out, is(expected));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] input = new int[]{12, 1, 12};
        List<Boolean> out = solution.kidsWithCandies(input, 10);
        List<Boolean> expected = List.of(true, false, true);
        assertThat(out, is(expected));
    }
}