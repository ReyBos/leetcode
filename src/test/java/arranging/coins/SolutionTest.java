package arranging.coins;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        assertEquals(2, solution.arrangeCoins(5));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        assertEquals(3, solution.arrangeCoins(8));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        assertEquals(2, solution.arrangeCoins(3));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        assertEquals(5, solution.arrangeCoins(15));
    }
}