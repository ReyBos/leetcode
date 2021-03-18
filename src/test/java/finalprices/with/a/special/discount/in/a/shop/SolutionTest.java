package finalprices.with.a.special.discount.in.a.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[] input;
    private int[] expected;

    public SolutionTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {new int[] {8, 4, 6, 2, 3}, new int[] {4, 2, 4, 2, 3}},
                {new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}},
                {new int[] {10, 1, 1, 6}, new int[] {9, 0, 1, 6}},
                {new int[] {10}, new int[] {10}}
        });
    }

    @Test
    public void finalPrices() {
        Solution solution = new Solution();
        assertThat(solution.finalPrices(input), is(expected));
    }
}