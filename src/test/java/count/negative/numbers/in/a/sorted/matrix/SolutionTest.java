package count.negative.numbers.in.a.sorted.matrix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[][] input;
    private int expected;

    public SolutionTest(int[][] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {new int[][] {
                        {4, 3, 2, -1},
                        {3, 2, 1, -1},
                        {1, 1, -1, -2},
                        {-1, -1, -2, -3}
                }, 8},
                {new int[][] {{3, 2}, {1, 0}}, 0},
                {new int[][] {{1, -1}, {-1, -1}}, 3},
                {new int[][] {{-1}}, 1}
        });
    }

    @Test
    public void countNegatives() {
        Solution solution = new Solution();
        assertThat(solution.countNegatives(input), is(expected));
    }
}