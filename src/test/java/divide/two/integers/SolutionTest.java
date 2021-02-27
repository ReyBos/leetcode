package divide.two.integers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        assertEquals(3, solution.divide(10, 3));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        assertEquals(-2, solution.divide(7, -3));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        assertEquals(0, solution.divide(0, 1));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        assertEquals(1, solution.divide(1, 1));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        assertEquals(2147483647, solution.divide(-2147483648, -1));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        assertEquals(-2147483648, solution.divide(-2147483648, 1));
    }
}