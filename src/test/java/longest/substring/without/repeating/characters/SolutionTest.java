package longest.substring.without.repeating.characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void abcabcbbThen3() {
        String input = "abcabcbb";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(3, out);
    }

    @Test
    public void bbbbbThen1() {
        String input = "bbbbb";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(1, out);
    }

    @Test
    public void bbThen1() {
        String input = "bb";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(1, out);
    }

    @Test
    public void pwwkewThen3() {
        String input = "pwwkew";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(3, out);
    }

    @Test
    public void whenEmptyThen0() {
        String input = "";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(0, out);
    }

    @Test
    public void abc12cThen5() {
        String input = "abc12c";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(5, out);
    }

    @Test
    public void dvdfThen3() {
        String input = "dvdf";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(3, out);
    }

    @Test
    public void abcdeThen5() {
        String input = "abcde";
        int out = Solution.lengthOfLongestSubstring(input);
        assertEquals(5, out);
    }
}