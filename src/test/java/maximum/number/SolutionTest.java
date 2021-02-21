package maximum.number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        assertEquals(9969, solution.maximum69Number(9669));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        assertEquals(9999, solution.maximum69Number(9996));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        assertEquals(9999, solution.maximum69Number(9999));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        assertEquals(9, solution.maximum69Number(6));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        assertEquals(96, solution.maximum69Number(66));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        assertEquals(966, solution.maximum69Number(666));
    }
}