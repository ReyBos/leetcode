package plus.one;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.is;
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
                {new int[] {1, 2, 3}, new int[] {1, 2, 4}},
                {new int[] {4, 3, 2, 1}, new int[] {4, 3, 2, 2}},
                {new int[] {0}, new int[] {1}},
                {new int[] {9, 9, 9}, new int[] {1, 0, 0, 0}},
                {new int[] {2, 9, 9}, new int[] {3, 0, 0}}
        });
    }

    @Test
    public void plusOne() {
        Solution solution = new Solution();
        assertThat(solution.plusOne(input), is(expected));
    }
}