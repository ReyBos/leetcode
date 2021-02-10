package to.lower;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String input = "Hello";
        String expected = "hello";
        assertThat(solution.toLowerCase(input), is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String input = "here";
        String expected = "here";
        assertThat(solution.toLowerCase(input), is(expected));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String input = "LOVELY";
        String expected = "lovely";
        assertThat(solution.toLowerCase(input), is(expected));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String input = "al&phaBET";
        String expected = "al&phabet";
        assertThat(solution.toLowerCase(input), is(expected));
    }
}