package merge.strings.alternately;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        assertThat(solution.mergeAlternately(word1, word2), is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        assertThat(solution.mergeAlternately(word1, word2), is(expected));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        assertThat(solution.mergeAlternately(word1, word2), is(expected));
    }
}