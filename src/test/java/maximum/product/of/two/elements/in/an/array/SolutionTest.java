package maximum.product.of.two.elements.in.an.array;

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
    private int expected;

    public SolutionTest(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {new int[] {3, 4, 5, 2}, 12},
                {new int[] {1, 5, 4, 5}, 16},
                {new int[] {3, 7}, 12}
        });
    }

    @Test
    public void diagonalSum() {
        Solution solution = new Solution();
        assertThat(solution.maxProduct(input), is(expected));
    }
}