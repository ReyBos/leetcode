package validate.stack.sequences;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] pushed = new int[] {1, 2, 3, 4, 5};
        int[] popped = new int[] {4, 5, 3, 2, 1};
        assertTrue(solution.validateStackSequences(pushed, popped));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] pushed = new int[] {1, 2, 3, 4, 5};
        int[] popped = new int[] {4, 3, 5, 1, 2};
        assertFalse(solution.validateStackSequences(pushed, popped));
    }
}