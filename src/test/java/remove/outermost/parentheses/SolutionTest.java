package remove.outermost.parentheses;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private String input;
    private String expected;

    public SolutionTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {"(()())(())", "()()()"},
                {"(()())(())(()(()))", "()()()()(())"},
                {"()()", ""}
        });
    }

    @Test
    public void removeOuterParentheses() {
        Solution solution = new Solution();
        assertThat(solution.removeOuterParentheses(input), is(expected));
    }
}