package flipping.an.image;

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
    private int[][] expected;

    public SolutionTest(int[][] input, int[][] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {
                    new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}},
                    new int[][] {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}
                },
                {
                    new int[][] {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}},
                    new int[][] {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}
                }
        });
    }

    @Test
    public void flipAndInvertImage() {
        Solution solution = new Solution();
        assertThat(solution.flipAndInvertImage(input), is(expected));
    }
}