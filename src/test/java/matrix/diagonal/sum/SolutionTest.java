package matrix.diagonal.sum;

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
                {
                    new int[][] {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    }, 25
                },
                {
                    new int[][] {
                            {1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1}
                    }, 8
                },
                {
                    new int[][] {
                            {7, 3, 1, 9},
                            {3, 4, 6, 9},
                            {6, 9, 6, 6},
                            {9, 5, 8, 5}
                    }, 55
                },
                {new int[][] {{5}}, 5}
        });
    }

    @Test
    public void diagonalSum() {
        Solution solution = new Solution();
        assertThat(solution.diagonalSum(input), is(expected));
    }
}