package check.two.string.arrays.are.equivalent;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String[] word1 = new String[] {"ab", "c"};
        String[] word2 = new String[] {"a", "bc"};
        assertTrue(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String[] word1 = new String[] {"a", "cb"};
        String[] word2 = new String[] {"ab", "c"};
        assertFalse(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String[] word1 = new String[] {"abc", "d", "defg"};
        String[] word2 = new String[] {"abcddefg"};
        assertTrue(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String[] word1 = new String[] {"ab", "c"};
        String[] word2 = new String[] {"a", "bcd"};
        assertFalse(solution.arrayStringsAreEqual(word1, word2));
    }
}