package palindrome.number;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
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
                {121, true},
                {1, true},
                {11, true},
                {-121, false},
                {10, false},
                {-101, false},
                {1000000001, true}
        });
    }

    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        assertThat(solution.isPalindrome(input), is(expected));
    }
}