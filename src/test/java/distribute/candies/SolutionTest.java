package distribute.candies;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] candyType = new int[] {1, 1, 2, 2, 3, 3};
        assertEquals(3, solution.distributeCandies(candyType));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] candyType = new int[] {1, 1, 2, 3};
        assertEquals(2, solution.distributeCandies(candyType));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] candyType = new int[] {6, 6, 6, 6};
        assertEquals(1, solution.distributeCandies(candyType));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] candyType = new int[] {1000, 1, 1, 1};
        assertEquals(2, solution.distributeCandies(candyType));
    }
}