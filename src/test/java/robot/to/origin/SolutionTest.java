package robot.to.origin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private String input;
    private boolean expected;

    public SolutionTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {"UD", true},
                {"LL", false},
                {"RRDD", false},
                {"LDRRLRUULR", false}
        });
    }

    @Test
    public void judgeCircle() {
        Solution solution = new Solution();
        assertThat(solution.judgeCircle(input), is(expected));
    }
}