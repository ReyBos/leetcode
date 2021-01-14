package shuffle.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        String str = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        String rsl = solution.restoreString(str, indices);
        String expected = "leetcode";
        assertEquals(expected, rsl);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String str = "abc";
        int[] indices = new int[]{0, 1, 2};
        String rsl = solution.restoreString(str, indices);
        String expected = "abc";
        assertEquals(expected, rsl);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String str = "aiohn";
        int[] indices = new int[]{3, 1, 4, 2, 0};
        String rsl = solution.restoreString(str, indices);
        String expected = "nihao";
        assertEquals(expected, rsl);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String str = "aaiougrt";
        int[] indices = new int[]{4, 0, 2, 6, 7, 3, 1, 5};
        String rsl = solution.restoreString(str, indices);
        String expected = "arigatou";
        assertEquals(expected, rsl);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String str = "art";
        int[] indices = new int[]{1, 0, 2};
        String rsl = solution.restoreString(str, indices);
        String expected = "rat";
        assertEquals(expected, rsl);
    }
}