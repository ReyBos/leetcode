package lucky.numbers.in.a.matrix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[][] input;
    private List<Integer> expected;

    public SolutionTest(int[][] input, List<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}, List.of(15)},
                {new int[][] {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}, List.of(12)},
                {new int[][] {{7, 8}, {1, 2}}, List.of(7)},
        });
    }

    @Test
    public void luckyNumbers() {
        Solution solution = new Solution();
        assertThat(solution.luckyNumbers(input), is(expected));
    }
}