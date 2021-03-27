package n.repeated.element.in.size.two.n.array;

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
                {new int[] {1, 2, 3, 3}, 3},
                {new int[] {2, 1, 2, 5, 3, 2}, 2},
                {new int[] {5, 1, 5, 2, 5, 3, 5, 4}, 5}
        });
    }

    @Test
    public void repeatedNTimes() {
        Solution solution = new Solution();
        assertThat(solution.repeatedNTimes(input), is(expected));
    }
}