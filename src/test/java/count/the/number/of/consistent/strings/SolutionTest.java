package count.the.number.of.consistent.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String allowed = "ab";
        String[] words = new String[] {"ad", "bd", "aaab", "baa", "badab"};
        assertEquals(2, solution.countConsistentStrings(allowed, words));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String allowed = "abc";
        String[] words = new String[] {"a", "b", "c", "ab", "ac", "bc", "abc"};
        assertEquals(7, solution.countConsistentStrings(allowed, words));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String allowed = "cad";
        String[] words = new String[] {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        assertEquals(4, solution.countConsistentStrings(allowed, words));
    }
}