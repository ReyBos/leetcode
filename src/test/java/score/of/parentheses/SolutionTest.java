package score.of.parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String input = "()";
        assertEquals(1, solution.scoreOfParentheses(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String input = "(())";
        assertEquals(2, solution.scoreOfParentheses(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String input = "()()";
        assertEquals(2, solution.scoreOfParentheses(input));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String input = "(()(()))";
        assertEquals(6, solution.scoreOfParentheses(input));
    }
}