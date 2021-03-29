package reverse.integer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int input;
    private int expected;

    public SolutionTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {123, 321},
                {-123, -321},
                {120, 21},
                {0, 0},
                {2147483647, 0},
                {-2147483648, 0}
        });
    }

    @Test
    public void reverse() {
        Solution solution = new Solution();
        assertThat(solution.reverse(input), is(expected));
    }
}