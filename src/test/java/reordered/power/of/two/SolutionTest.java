package reordered.power.of.two;

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
    private boolean expected;

    public SolutionTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {1, true},
                {8, true},
                {10, false},
                {16, true},
                {24, false},
                {46, true},
                {635078219, true},
                {1073741824, true}
        });
    }

    @Test
    public void reorderedPowerOf2() {
        Solution solution = new Solution();
        assertThat(solution.reorderedPowerOf2(input), is(expected));
    }
}