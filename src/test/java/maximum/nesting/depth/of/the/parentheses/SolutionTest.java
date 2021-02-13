package maximum.nesting.depth.of.the.parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String input = "(1+(2*3)+((8)/4))+1";
        assertEquals(3, solution.maxDepth(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String input = "(1)+((2))+(((3)))";
        assertEquals(3, solution.maxDepth(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String input = "1+(2*3)/(2-1)";
        assertEquals(1, solution.maxDepth(input));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String input = "1";
        assertEquals(0, solution.maxDepth(input));
    }
}