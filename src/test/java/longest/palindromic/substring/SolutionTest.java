package longest.palindromic.substring;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void longestPalindrome() {
        Solution solution = new Solution();
        String rsl = solution.longestPalindrome("a");
        String expected = "a";
        assertThat(rsl, is(expected));
        rsl = solution.longestPalindrome("aa");
        expected = "aa";
        assertThat(rsl, is(expected));
        rsl = solution.longestPalindrome("baa");
        expected = "aa";
        assertThat(rsl, is(expected));
        rsl = solution.longestPalindrome("baab");
        expected = "baab";
        assertThat(rsl, is(expected));
        rsl = solution.longestPalindrome("aab");
        expected = "aa";
        assertThat(rsl, is(expected));
    }

    @Test
    public void fromLeetCode() {
        Solution solution = new Solution();
        String rsl = solution.longestPalindrome("babad");
        String expected = "bab";
        assertThat(rsl, is(expected));
        rsl = solution.longestPalindrome("cbbd");
        expected = "bb";
        assertThat(rsl, is(expected));
        rsl = solution.longestPalindrome("ac");
        expected = "a";
        assertThat(rsl, is(expected));
    }

    @Test
    public void finalTest() {
        Solution solution = new Solution();
        String rsl = solution.longestPalindrome(
                "HYTBCABADEFGHABCDEDCBAGHTFYW1234567887654321ZWETYGDE"
        );
        String expected = "1234567887654321";
        assertThat(rsl, is(expected));
    }
}