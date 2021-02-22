package longest.word.in.dictionary.through.deleting;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "abpcplea";
        List<String> d = List.of("ale", "apple", "monkey", "plea");
        String rsl = solution.findLongestWord(s, d);
        assertThat(rsl, is("apple"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "abpcplea";
        List<String> d = List.of("a", "b", "c");
        String rsl = solution.findLongestWord(s, d);
        assertThat(rsl, is("a"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "bab";
        List<String> d = List.of("ba", "ab", "a", "b");
        String rsl = solution.findLongestWord(s, d);
        assertThat(rsl, is("ab"));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s = "aewfafwafjlwajflwajflwafj";
        List<String> d = List.of("apple", "ewaf", "awefawfwaf", "awef", "awefe", "ewafeffewafewf");
        String rsl = solution.findLongestWord(s, d);
        assertThat(rsl, is("ewaf"));
    }
}